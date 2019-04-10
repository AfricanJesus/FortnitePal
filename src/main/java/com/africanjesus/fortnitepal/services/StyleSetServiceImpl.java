package com.africanjesus.fortnitepal.services;

import com.africanjesus.fortnitepal.model.documents.StyleSet;
import com.africanjesus.fortnitepal.repositories.StyleSetRepository;
import com.africanjesus.fortnitepal.services.interfaces.StyleSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StyleSetServiceImpl implements StyleSetService {

    private StyleSetRepository styleSetRepository;

    public StyleSetServiceImpl(){
    }

    @Autowired
    public StyleSetServiceImpl(StyleSetRepository styleSetRepository) {
        this.styleSetRepository = styleSetRepository;
    }

    @Override
    public void save(StyleSet set) {
        styleSetRepository.save(set);
    }
    @Override
    public List<StyleSet> findAll(){
        return styleSetRepository.findAll();
    }
}
