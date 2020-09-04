package com.kleffy.mintbank.challengeproducer.factory.cardscheme;

import com.kleffy.mintbank.challengeproducer.domain.cardsheme.VerifyCardResponse;
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