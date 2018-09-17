package com.africanjesus.fortnitepal.repositories;

import com.africanjesus.fortnitepal.ItemType;
import com.africanjesus.fortnitepal.RarityType;
import com.africanjesus.fortnitepal.ReleaseStatus;
import com.africanjesus.fortnitepal.model.Item;
import com.africanjesus.fortnitepal.model.Obtained;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

    List<Item> findByRarityTypeAndItemType(@Param("rarity") RarityType rarity, @Param("item") ItemType item, Pageable p);
    List<Item> findByRarityType(@Param("rarity") RarityType rarity, Pageable p);
    List<Item> findByItemType(@Param("item") ItemType item, Pageable p);
    List<Item> findByStatus(@Param("status")ReleaseStatus status, Pageable p);
    List<Item> findBySet(@Param("set")String set, Pageable p);
    List<Item> findByObtained_Promo(@Param("promo")String promo, Pageable p);
    List<Item> findByObtained_Challenge(@Param("challenge")String challenge, Pageable p);
    List<Item> findByObtained_Season(@Param("season")int season, Pageable p);
    List<Item> findByObtained_IncludedInName(@Param("includedInName") String includedInName);
    List<Item> findByNameAndItemType(@Param("name")String name, @Param("item") ItemType item, Pageable p);
}
