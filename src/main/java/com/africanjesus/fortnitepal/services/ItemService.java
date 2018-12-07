package com.africanjesus.fortnitepal.services;

import com.africanjesus.fortnitepal.model.Item;

import java.util.List;

public interface ItemService {

    void save(Item item);
    List<Item> findAll();
}
