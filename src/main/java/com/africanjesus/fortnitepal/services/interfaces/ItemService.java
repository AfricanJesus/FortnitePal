package com.africanjesus.fortnitepal.services.interfaces;

import com.africanjesus.fortnitepal.model.documents.Item;

import java.util.List;

public interface ItemService {

    void save(Item item);
    List<Item> findAll();
}
