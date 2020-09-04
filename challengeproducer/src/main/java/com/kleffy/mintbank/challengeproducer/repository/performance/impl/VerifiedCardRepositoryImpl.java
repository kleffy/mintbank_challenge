package com.kleffy.mintbank.challengeproducer.repository.performance.impl;

import com.kleffy.mintbank.challengeproducer.domain.performance.VerifiedCard;
import com.kleffy.mintbank.challengeproducer.repository.performance.VerifiedCardRepository;

import java.util.HashSet;
import java.util.Set;

public class VerifiedCardRepositoryImpl implements VerifiedCardRepository {

    private  Set<VerifiedCard> cardDB;
    private static  VerifiedCardRepository repository = null;

    private VerifiedCardRepositoryImpl(){
        this.cardDB = new HashSet<>();
    }

    public static  VerifiedCardRepository getRepository(){
        if(repository == null) repository = new VerifiedCardRepositoryImpl();
        return repository;
    }

    @Override
    public Set<VerifiedCard> getAll() {
        return this.cardDB;
    }

    @Override
    public VerifiedCard create(VerifiedCard d) {
        this.cardDB.add(d);
        return d;
    }

    @Override
    public VerifiedCard read(String s) {
        VerifiedCard verifiedCard = this.cardDB.stream().filter(vc -> vc.getCardNumber().equalsIgnoreCase(s))
                .findAny().orElse(null);
        return verifiedCard;
    }

    @Override
    public VerifiedCard update(VerifiedCard verifiedCard) {
        //        VerifiedCard card = read(verifiedCard.getCardNumber());
//        if (card != null) {
//            this.cardDB.remove(card);
//            this.cardDB.add(verifiedCard);
//            return verifiedCard;
//        }
//        return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(String s) {
        throw new UnsupportedOperationException();
    }
}
