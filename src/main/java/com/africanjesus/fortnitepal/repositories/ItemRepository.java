package com.africanjesus.fortnitepal.repositories;

import com.africanjesus.fortnitepal.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
}
