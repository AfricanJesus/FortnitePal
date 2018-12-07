package com.africanjesus.fortnitepal.services;


import com.africanjesus.fortnitepal.model.ChallengeSet;

import java.util.List;

public interface ChallengeSetService {

    void save(ChallengeSet set);
    List<ChallengeSet> findAll();
}
