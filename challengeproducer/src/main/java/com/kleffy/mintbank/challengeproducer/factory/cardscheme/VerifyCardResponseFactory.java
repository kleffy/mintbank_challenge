package com.kleffy.mintbank.challengeproducer.factory.cardscheme;

import com.kleffy.mintbank.challengeproducer.domain.cardsheme.Payload;
import com.kleffy.mintbank.challengeproducer.domain.cardsheme.VerifyCardResponse;

public class VerifyCardResponseFactory {

    public static VerifyCardResponse buildVerifyCardResponse(boolean success, String scheme, String type, String bank){
        Payload payload = PayloadFactory.buildCardPayload(scheme, type, bank);
        return new VerifyCardResponse.Builder()
                .cardPayload(payload)
                .success(success)
                .build();
    }
}
