package com.africanjesus.fortnitepal.repositories;

import com.africanjesus.fortnitepal.model.ChallengeSet;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@Repository
public interface ChallengeSetRepository extends JpaRepository<ChallengeSet, Long> {

    ChallengeSet findByChallengeSetName(@Param("name")String name);
}
