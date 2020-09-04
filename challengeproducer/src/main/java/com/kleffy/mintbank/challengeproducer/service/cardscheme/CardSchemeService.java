package com.kleffy.mintbank.challengeproducer.service.cardscheme;

import com.kleffy.mintbank.challengeproducer.domain.cardsheme.VerifyCardResponse;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface CardSchemeService {
    ResponseEntity<VerifyCardResponse> verifyCard(String cardNumber) throws IOException, InterruptedException;

    ResponseEntity<?> retrieveStats(int start, int limit);
}
