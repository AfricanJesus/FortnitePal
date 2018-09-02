package com.africanjesus.fortnitepal.services;

import com.africanjesus.fortnitepal.model.Item;
import com.africanjesus.fortnitepal.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    public ItemServiceImpl(){
    }

    @Autowired
    private ItemServiceImpl(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }
}
