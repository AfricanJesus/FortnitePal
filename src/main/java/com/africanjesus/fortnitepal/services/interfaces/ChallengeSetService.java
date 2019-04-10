package com.africanjesus.fortnitepal.services.interfaces;


import com.africanjesus.fortnitepal.model.documents.ChallengeSet;

import java.util.List;

public interface ChallengeSetService {

    void save(ChallengeSet set);
    List<ChallengeSet> findAll();
}
