package com.africanjesus.fortnitepal.repositories;

import com.africanjesus.fortnitepal.model.ChallengeSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeSetRepository extends JpaRepository<ChallengeSet, Long> {
}
