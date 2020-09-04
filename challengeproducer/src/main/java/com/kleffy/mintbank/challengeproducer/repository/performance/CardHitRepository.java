package com.kleffy.mintbank.challengeproducer.repository.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.CardHit;
import com.kleffy.mintbank.challengeproducer.repository.IRepository;

import java.util.Map;

public interface CardHitRepository extends IRepository<CardHit, String> {
    Map<String, Integer> getNumberOfHits(int limit);
}
