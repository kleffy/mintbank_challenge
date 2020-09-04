package com.kleffy.mintbank.challengeproducer.factory.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.VerifiedCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifiedCardFactoryTest {

    @Test
    void buildVerifiedCard() {
        VerifiedCard vc = VerifiedCardFactory.buildVerifiedCard("453643", "visa", "debit", "MInt Bank Ltd.");
        System.out.println(vc);
        assertNotNull(vc);
    }
}