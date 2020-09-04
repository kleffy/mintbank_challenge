package com.kleffy.mintbank.challengeproducer.service.performance.impl;

import com.kleffy.mintbank.challengeproducer.domain.performance.CardHit;
import com.kleffy.mintbank.challengeproducer.repository.performance.CardHitRepository;
import com.kleffy.mintbank.challengeproducer.repository.performance.impl.CardHitRepositoryImpl;
import com.kleffy.mintbank.challengeproducer.service.performance.CardHitService;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class CardHitServiceImpl implements CardHitService {

    private static CardHitService service = null;
    private CardHitRepository repository;

    private CardHitServiceImpl(){
        this.repository = CardHitRepositoryImpl.getRepository();
    }

    public static CardHitService getService(){
        if(service == null ){
            service = new CardHitServiceImpl();
        }
        return service;
    }

    @Override
    public Map<String, Integer> getNumberOfHits(int limit) {
        return this.repository.getNumberOfHits(limit);
    }

    @Override
    public CardHit create(CardHit d) {
        return this.repository.create(d);
    }

    @Override
    public CardHit update(CardHit cardHit) {
        return this.repository.update(cardHit);
    }

    @Override
    public CardHit read(String s) {
        return this.repository.read(s);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
