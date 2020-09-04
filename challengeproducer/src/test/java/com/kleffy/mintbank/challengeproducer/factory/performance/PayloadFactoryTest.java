package com.kleffy.mintbank.challengeproducer.factory.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.Payload;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PayloadFactoryTest {

    @Test
    void buildPayload() {
        Map<String, Integer> cardHits = new HashMap<>();
        cardHits.put("547836", 3);
        cardHits.put("438946", 1);
        cardHits.put("516251", 4);
        Payload payload = PayloadFactory.buildPayload(cardHits);
        System.out.println(payload);
        assertNotNull(payload);
    }
}