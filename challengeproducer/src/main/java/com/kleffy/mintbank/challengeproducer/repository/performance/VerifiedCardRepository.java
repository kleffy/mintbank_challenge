package com.kleffy.mintbank.challengeproducer.repository.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.VerifiedCard;
import com.kleffy.mintbank.challengeproducer.repository.IRepository;

import java.util.Set;

public interface VerifiedCardRepository extends IRepository<VerifiedCard, String> {
    Set<VerifiedCard> getAll();
}
