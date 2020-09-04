package com.kleffy.mintbank.challengeproducer.factory.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.CardHit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardHitFactoryTest {

    @Test
    void buildCardHit() {
        CardHit ch = CardHitFactory.buildCardHit("542817", 3);
        assertNotNull(ch);
    }
}