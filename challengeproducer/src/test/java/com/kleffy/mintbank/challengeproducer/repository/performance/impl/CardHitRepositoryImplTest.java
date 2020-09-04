package com.kleffy.mintbank.challengeproducer.repository.performance.impl;

import com.kleffy.mintbank.challengeproducer.domain.performance.CardHit;
import com.kleffy.mintbank.challengeproducer.factory.performance.CardHitFactory;
import com.kleffy.mintbank.challengeproducer.repository.performance.CardHitRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardHitRepositoryImplTest {

    private static CardHit cardHit = CardHitFactory.buildCardHit("5434534", 0);
    private static CardHitRepository repository = CardHitRepositoryImpl.getRepository();

    @Test
    void create() {
        CardHit ch = repository.create(cardHit);
        assertNotNull(ch);
    }

    @Test
    void read() {
        CardHit cd = repository.read(cardHit.getCardNumber());
        assertNotNull(cd);
    }

    @Test
    void update() {
        CardHit cd = repository.update(cardHit);
        assertEquals(1, cd.getHitTimes());
        System.out.println("Updated: " + cd);
    }
}