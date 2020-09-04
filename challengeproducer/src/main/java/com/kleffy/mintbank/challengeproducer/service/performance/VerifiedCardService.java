package com.kleffy.mintbank.challengeproducer.service.performance;

import com.kleffy.mintbank.challengeproducer.domain.performance.VerifiedCard;
import com.kleffy.mintbank.challengeproducer.service.IService;

import java.util.Set;

public interface VerifiedCardService extends IService<VerifiedCard, String> {
    Set<VerifiedCard> getAll();
}
