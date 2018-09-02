package com.africanjesus.fortnitepal.repositories;

import com.africanjesus.fortnitepal.model.StyleSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleSetRepository extends JpaRepository <StyleSet, Long> {
}
