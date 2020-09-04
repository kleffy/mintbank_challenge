package com.kleffy.mintbank.challengeproducer.service.performance.impl;

import com.kleffy.mintbank.challengeproducer.domain.performance.VerifiedCard;
import com.kleffy.mintbank.challengeproducer.repository.performance.VerifiedCardRepository;
import com.kleffy.mintbank.challengeproducer.repository.performance.impl.VerifiedCardRepositoryImpl;
import com.kleffy.mintbank.challengeproducer.service.performance.VerifiedCardService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VerifiedCardServiceImpl implements VerifiedCardService {

    private static VerifiedCardService service = null;
    private VerifiedCardRepository repository;

    private VerifiedCardServiceImpl(){
        this.repository = VerifiedCardRepositoryImpl.getRepository();
    }

    public static VerifiedCardService getService(){
        if(service == null) service = new VerifiedCardServiceImpl();
        return service;
    }

    @Override
    public Set<VerifiedCard> getAll() {
        return this.repository.getAll();
    }

    @Override
    public VerifiedCard create(VerifiedCard d) {
        return this.repository.create(d);
    }

    @Override
    public VerifiedCard update(VerifiedCard verifiedCard) {
        return this.repository.update(verifiedCard);
    }

    @Override
    public VerifiedCard read(String s) {
        return this.repository.read(s);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
