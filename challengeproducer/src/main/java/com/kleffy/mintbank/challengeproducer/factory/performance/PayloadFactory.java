package com.kleffy.mintbank.challengeproducer.factory.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.Payload;

import java.util.Map;

public class PayloadFactory {

    public static Payload buildPayload(Map<String, Integer> cardHits){
        return new Payload.Builder()
                .cardHits(cardHits)
                .build();
    }
}
