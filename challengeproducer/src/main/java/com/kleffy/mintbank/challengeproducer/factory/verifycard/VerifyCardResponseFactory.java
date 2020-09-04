package com.kleffy.mintbank.challengeproducer.factory.verifycard;

import com.kleffy.mintbank.challengeproducer.domain.verifycard.Payload;
import com.kleffy.mintbank.challengeproducer.domain.verifycard.VerifyCardResponse;

public class VerifyCardResponseFactory {

    public static VerifyCardResponse buildVerifyCardResponse(boolean success, String scheme, String type, String bank){
        Payload payload = PayloadFactory.buildCardPayload(scheme, type, bank);
        return new VerifyCardResponse.Builder()
                .cardPayload(payload)
                .success(success)
                .build();
    }
}
