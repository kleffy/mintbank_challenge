package com.kleffy.mintbank.challengeproducer.factory.cardscheme;

import com.kleffy.mintbank.challengeproducer.domain.cardsheme.Payload;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayloadFactoryTest {

    @Test
    void buildCardPayload() {
        Payload payload = PayloadFactory.buildCardPayload("MasterCard", "Credit", "Mint Bank Ltd.");
        System.out.println(payload);
        assertNotNull(payload);
    }
}