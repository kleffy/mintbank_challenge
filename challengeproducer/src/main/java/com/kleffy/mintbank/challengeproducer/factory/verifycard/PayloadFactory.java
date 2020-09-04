package com.kleffy.mintbank.challengeproducer.factory.verifycard;


import com.kleffy.mintbank.challengeproducer.domain.verifycard.Payload;

public class PayloadFactory {

    public static Payload buildCardPayload(String scheme, String type, String bank){
        return new Payload.Builder()
                .bank(bank)
                .scheme(scheme)
                .type(type)
                .build();
    }
}
