package com.kleffy.mintbank.challengeproducer.factory.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.Payload;
import com.kleffy.mintbank.challengeproducer.domain.performance.PerformanceResponse;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceResponseFactoryTest {

    @Test
    void buildPerformanceResponse() {
        Map<String, Integer> cardHits = new HashMap<>();
        cardHits.put("547836", 3);
        cardHits.put("438946", 1);
        cardHits.put("516251", 4);
        Payload payload = PayloadFactory.buildPayload(cardHits);
        PerformanceResponse pr = PerformanceResponseFactory.buildPerformanceResponse(true, 1, 3, 3, payload);
        System.out.println(pr);
        assertNotNull(pr);
    }
}