package com.africanjesus.fortnitepal.services;

import com.africanjesus.fortnitepal.model.Item;
import com.africanjesus.fortnitepal.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {


    ItemRepository itemRepository;

    @Autowired
    private ItemServiceImpl(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public ItemServiceImpl(){

    }

    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }
}
