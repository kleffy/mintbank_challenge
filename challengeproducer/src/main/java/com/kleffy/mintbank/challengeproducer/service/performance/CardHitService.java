package com.kleffy.mintbank.challengeproducer.service.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.CardHit;
import com.kleffy.mintbank.challengeproducer.service.IService;

import java.util.Map;

public interface CardHitService extends IService<CardHit, String> {
    Map<String, Integer> getNumberOfHits(int limit);
}
