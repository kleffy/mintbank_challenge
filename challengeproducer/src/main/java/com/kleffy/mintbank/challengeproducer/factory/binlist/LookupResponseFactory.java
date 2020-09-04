package com.kleffy.mintbank.challengeproducer.factory.binlist;

import com.kleffy.mintbank.challengeproducer.domain.binlist.Bank;
import com.kleffy.mintbank.challengeproducer.domain.binlist.LookupResponse;

public class LookupResponseFactory {

    public static LookupResponse buildLookupResponse(String scheme, String type, String bank){
        Bank b = BankFactory.buildBank(bank);
        return new LookupResponse.Builder()
                .scheme(scheme)
                .type(type)
                .bank(b)
                .build();
    }
}
