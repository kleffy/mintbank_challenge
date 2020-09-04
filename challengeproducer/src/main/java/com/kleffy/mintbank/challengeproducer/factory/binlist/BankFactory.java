package com.kleffy.mintbank.challengeproducer.factory.binlist;

import com.kleffy.mintbank.challengeproducer.domain.binlist.Bank;

public class BankFactory {

    public static Bank buildBank(String name){
        return new Bank.Builder()
                .name(name)
                .build();
    }
}
