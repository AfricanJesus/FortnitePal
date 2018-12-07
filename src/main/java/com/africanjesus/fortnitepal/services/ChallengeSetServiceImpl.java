package com.africanjesus.fortnitepal.services;

import com.africanjesus.fortnitepal.model.ChallengeSet;
import com.africanjesus.fortnitepal.repositories.ChallengeSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeSetServiceImpl implements ChallengeSetService{

    private ChallengeSetRepository challengeSetRepository;

    public ChallengeSetServiceImpl(){
    }

    @Autowired
    public ChallengeSetServiceImpl(ChallengeSetRepository challengeSetRepository) {
        this.challengeSetRepository = challengeSetRepository;
    }

    @Override
    public void save(ChallengeSet set) {
        challengeSetRepository.save(set);
    }

    @Override
    public List<ChallengeSet> findAll(){
        return challengeSetRepository.findAll();
    }
}
