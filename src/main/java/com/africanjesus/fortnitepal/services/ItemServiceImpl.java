package com.africanjesus.fortnitepal.services;

import com.africanjesus.fortnitepal.model.documents.Item;
import com.africanjesus.fortnitepal.repositories.ItemRepository;
import com.africanjesus.fortnitepal.services.interfaces.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;
    private NextSequenceService nextSequenceService;

    public ItemServiceImpl(){
    }

    @Autowired
    private ItemServiceImpl(ItemRepository itemRepository, NextSequenceService nextSequenceService){
        this.itemRepository = itemRepository;
        this.nextSequenceService = nextSequenceService;
    }

    @Override
    public void save(Item item) {
        if(item.getId() == 0){
            item.setId(nextSequenceService.getNextSequence("customSequences"));
        }
        itemRepository.save(item);
    }
    @Override
    public List<Item> findAll(){
        return itemRepository.findAll();
    }
}
