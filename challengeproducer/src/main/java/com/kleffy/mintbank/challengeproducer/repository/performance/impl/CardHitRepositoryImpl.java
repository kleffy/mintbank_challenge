package com.kleffy.mintbank.challengeproducer.repository.performance.impl;

import com.kleffy.mintbank.challengeproducer.domain.performance.CardHit;
import com.kleffy.mintbank.challengeproducer.repository.performance.CardHitRepository;

import java.util.HashMap;
import java.util.Map;

public class CardHitRepositoryImpl implements CardHitRepository {

    private Map<String, CardHit> cardHitDB;
    private static CardHitRepository repository = null;

    private CardHitRepositoryImpl() {
        this.cardHitDB = new HashMap<>();
    }

    public static CardHitRepository getRepository() {
        if (repository == null) repository = new CardHitRepositoryImpl();
        return repository;
    }

    @Override
    public Map<String, Integer> getNumberOfHits(int limit) {
        Map<String, Integer> cardHits = new HashMap<>();
        int count = 1;
        for (Map.Entry<String, CardHit> entry : this.cardHitDB.entrySet()) {
            if (count <= limit) {
                cardHits.put(entry.getValue().getCardNumber(),entry.getValue().getHitTimes());
                count++;
            } else {
                break;
            }
        }
        return cardHits;
    }

    @Override
    public CardHit create(CardHit d) {
        this.cardHitDB.put(d.getCardNumber(), d);
        return d;
    }

    @Override
    public CardHit update(CardHit cardHit) {
        CardHit c = read(cardHit.getCardNumber());
        if (c != null) {
            int newHit = c.getHitTimes() + 1;
            CardHit newCH = new CardHit.Builder().copy(c).hitTimes(newHit).build();
            this.cardHitDB.put(c.getCardNumber(), newCH);
            return newCH;
        }
        return null;
    }

    @Override
    public CardHit read(String s) {
        boolean hitExist = this.cardHitDB.containsKey(s);
        if(hitExist){
            return this.cardHitDB.get(s);
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        throw new UnsupportedOperationException();
    }
}
