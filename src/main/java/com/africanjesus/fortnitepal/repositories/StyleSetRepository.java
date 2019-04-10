package com.africanjesus.fortnitepal.repositories;

import com.africanjesus.fortnitepal.model.documents.StyleSet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleSetRepository extends MongoRepository<StyleSet, Integer> {
    StyleSet findByStyleSetName(@Param("name")String name);
}
