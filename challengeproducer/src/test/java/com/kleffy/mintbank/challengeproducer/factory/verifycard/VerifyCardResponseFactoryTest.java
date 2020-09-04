package com.kleffy.mintbank.challengeproducer.factory.verifycard;

import com.kleffy.mintbank.challengeproducer.domain.verifycard.VerifyCardResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifyCardResponseFactoryTest {

    @Test
    void buildVerifyCardResponse() {
        VerifyCardResponse vc = VerifyCardResponseFactory.buildVerifyCardResponse(true, "Visa", "credit", "Mint Bank Ltd.");
        System.out.println(vc);
        assertNotNull(vc);
    }
}