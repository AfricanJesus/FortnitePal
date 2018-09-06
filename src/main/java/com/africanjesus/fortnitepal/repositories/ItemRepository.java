package com.africanjesus.fortnitepal.repositories;

import com.africanjesus.fortnitepal.ItemType;
import com.africanjesus.fortnitepal.RarityType;
import com.africanjesus.fortnitepal.model.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

    List<Item> findByRarityTypeAndItemType(@Param("rarity") RarityType rarity, @Param("item") ItemType item, Pageable p);
    List<Item> findByRarityType(@Param("rarity") RarityType rarity, Pageable p);
    List<Item> findByItemType(@Param("item") ItemType item, Pageable p);
    List<Item> findByObtained_Season(@Param("season")int season, Pageable p);
}
