package com.africanjesus.fortnitepal.services;

import com.africanjesus.fortnitepal.model.StyleSet;
import com.africanjesus.fortnitepal.repositories.StyleSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
