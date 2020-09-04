package com.kleffy.mintbank.challengeproducer.factory.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.CardHit;

public class CardHitFactory {

    public static CardHit buildCardHit(String cardNumber, int hitTimes){
        return new CardHit.Builder()
                .cardNumber(cardNumber)
                .hitTimes(hitTimes)
                .build();
    }
}
