package com.africanjesus.fortnitepal.repositories;

import com.africanjesus.fortnitepal.model.documents.ChallengeSet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeSetRepository extends MongoRepository<ChallengeSet, Integer> {

    ChallengeSet findByChallengeSetName(@Param("name")String name);
}
