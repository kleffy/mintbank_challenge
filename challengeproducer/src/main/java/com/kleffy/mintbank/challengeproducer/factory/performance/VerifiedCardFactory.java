package com.kleffy.mintbank.challengeproducer.factory.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.VerifiedCard;

public class VerifiedCardFactory {

    public static VerifiedCard buildVerifiedCard(String cardNumber, String scheme, String type, String bank) {
        return new VerifiedCard.Builder()
                .cardNumber(cardNumber)
                .scheme(scheme)
                .type(type)
                .bank(bank)
                .build();
    }
}
