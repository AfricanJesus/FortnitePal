package com.africanjesus.fortnitepal.repositories;

import com.africanjesus.fortnitepal.ItemType;
import com.africanjesus.fortnitepal.RarityType;
import com.africanjesus.fortnitepal.ReleaseStatus;
import com.africanjesus.fortnitepal.model.documents.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ItemRepository extends MongoRepository<Item, Integer>{

    List<Item> findByRarityTypeAndItemType(@Param("rarity") RarityType rarity, @Param("item") ItemType item, Pageable p);
    List<Item> findByRarityType(@Param("rarity") RarityType rarity, Pageable p);
    List<Item> findByItemType(@Param("item") ItemType item, Pageable p);
    List<Item> findByStatus(@Param("status")ReleaseStatus status, Pageable p);
    List<Item> findBySet(@Param("set")String set, Pageable p);
    List<Item> findByName(@Param("name")String name, Pageable p);
    Item findItemByName(@Param("name") String name);
    List<Item> findByObtained_Promo(@Param("promo")String promo, Pageable p);
    List<Item> findByObtained_Challenge(@Param("challenge")String challenge, Pageable p);
    List<Item> findByObtained_Season(@Param("season")int season, Pageable p);
    List<Item> findByObtained_IncludedInName(@Param("includedInName") String includedInName);
    List<Item> findByNameAndItemType(@Param("name")String name, @Param("item") ItemType item, Pageable p);
    List<Item> findItemByNameLike(@Param("name")String name);
    Item findItemById(@Param("id") int id);


}
