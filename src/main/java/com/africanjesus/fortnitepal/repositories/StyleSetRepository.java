package com.africanjesus.fortnitepal.repositories;

import com.africanjesus.fortnitepal.model.StyleSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface StyleSetRepository extends JpaRepository <StyleSet, Long> {
    StyleSet findByStyleSetName(@Param("name")String name);
}
