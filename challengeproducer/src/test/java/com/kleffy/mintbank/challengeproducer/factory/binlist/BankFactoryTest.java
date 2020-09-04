package com.kleffy.mintbank.challengeproducer.factory.binlist;

import com.kleffy.mintbank.challengeproducer.domain.binlist.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankFactoryTest {

    @Test
    void buildBank() {
        Bank bank = BankFactory.buildBank("Mint Bank Ltd.");
        assertNotNull(bank);
    }
}