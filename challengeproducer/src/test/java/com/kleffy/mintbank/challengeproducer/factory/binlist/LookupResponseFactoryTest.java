package com.kleffy.mintbank.challengeproducer.factory.binlist;

import com.kleffy.mintbank.challengeproducer.domain.binlist.LookupResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookupResponseFactoryTest {

    @Test
    void buildLookupResponse() {
        LookupResponse lr = LookupResponseFactory.buildLookupResponse("Visa", "credit", "Mint Bank Ltd.");
        assertNotNull(lr);
    }
}