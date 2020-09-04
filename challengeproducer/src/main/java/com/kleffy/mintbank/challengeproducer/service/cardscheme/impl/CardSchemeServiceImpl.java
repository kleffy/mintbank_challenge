package com.kleffy.mintbank.challengeproducer.service.cardscheme.impl;

import com.google.gson.Gson;
import com.kleffy.mintbank.challengeproducer.domain.binlist.LookupResponse;
import com.kleffy.mintbank.challengeproducer.domain.cardsheme.VerifyCardResponse;
import com.kleffy.mintbank.challengeproducer.domain.performance.CardHit;
import com.kleffy.mintbank.challengeproducer.domain.performance.Payload;
import com.kleffy.mintbank.challengeproducer.domain.performance.PerformanceResponse;
import com.kleffy.mintbank.challengeproducer.domain.performance.VerifiedCard;
import com.kleffy.mintbank.challengeproducer.factory.cardscheme.VerifyCardResponseFactory;
import com.kleffy.mintbank.challengeproducer.factory.performance.CardHitFactory;
import com.kleffy.mintbank.challengeproducer.factory.performance.PayloadFactory;
import com.kleffy.mintbank.challengeproducer.factory.performance.PerformanceResponseFactory;
import com.kleffy.mintbank.challengeproducer.factory.performance.VerifiedCardFactory;
import com.kleffy.mintbank.challengeproducer.service.cardscheme.CardSchemeService;
import com.kleffy.mintbank.challengeproducer.service.performance.impl.CardHitServiceImpl;
import com.kleffy.mintbank.challengeproducer.service.performance.impl.VerifiedCardServiceImpl;
import com.kleffy.mintbank.challengeproducer.util.HTTPHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.Map;

@Slf4j
@Service
public class CardSchemeServiceImpl implements CardSchemeService {
    @Value("${challenge.binlist.url}")
    private String binlistBaseUrl;
    private CardSchemeServiceImpl service = null;
    @Autowired
    private VerifiedCardServiceImpl verifiedCardService;
    @Autowired
    private CardHitServiceImpl cardHitService;

    private CardSchemeServiceImpl() {
    }

    public CardSchemeService getService() {
        if (service == null) {
            service = new CardSchemeServiceImpl();
        }
        return service;
    }

    @Override
    public ResponseEntity<VerifyCardResponse> verifyCard(String cardNumber) throws IOException, InterruptedException {
        //TODO: optimise, what happens if api returns with error?
        VerifyCardResponse cardResponse = null;
        VerifiedCard vc = verifiedCardService.read(cardNumber);
        if (vc == null) {
            System.out.println("Card not on our system. calling binlist...");
            cardResponse = callBinLisApi(cardNumber);
            vc = VerifiedCardFactory.buildVerifiedCard(cardNumber, cardResponse.getPayload().getScheme(), cardResponse.getPayload().getType(), cardResponse.getPayload().getBank());
            vc = verifiedCardService.create(vc);
            CardHit cardHit = CardHitFactory.buildCardHit(cardNumber, 1);
            cardHitService.create(cardHit);
        } else {
            System.out.println("Seems you have asked me about this card before. thinking...\n");
            String type = vc.getType();
            String scheme = vc.getScheme();
            String bank = vc.getBank();
            cardResponse = VerifyCardResponseFactory.buildVerifyCardResponse(true, scheme, type, bank);
            CardHit ch = cardHitService.read(cardNumber);
            cardHitService.update(ch);
        }
        return new ResponseEntity<>(cardResponse, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> retrieveStats(int start, int limit) {
        int size = verifiedCardService.getAll().size();
        Map<String, Integer> hits = cardHitService.getNumberOfHits(limit);
        Payload payload = PayloadFactory.buildPayload(hits);
        PerformanceResponse response = PerformanceResponseFactory.buildPerformanceResponse(true, start, limit, size, payload);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public VerifyCardResponse callBinLisApi(String cardNumber) throws IOException, InterruptedException {
        HttpResponse<String> response = HTTPHelper.sendGet(binlistBaseUrl + cardNumber);
        int statusCode = response.statusCode();
        String responseBody = response.body();
        LookupResponse lookupResponse = new Gson().fromJson(responseBody, LookupResponse.class);
        boolean success = statusCode == 200;
        return VerifyCardResponseFactory.buildVerifyCardResponse(success, lookupResponse.getScheme(), lookupResponse.getType(), lookupResponse.getBank().getName());
    }
}
