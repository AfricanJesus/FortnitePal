package com.africanjesus.fortnitepal.services;

import com.africanjesus.fortnitepal.repositories.StyleSetRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StyleSetServiceImpl implements StyleSetService {

    private StyleSetRepository styleSetRepository;

    public StyleSetServiceImpl(){
    }

    @Autowired
    public StyleSetServiceImpl(StyleSetRepository styleSetRepository) {
        this.styleSetRepository = styleSetRepository;
    }

    @Override
    public void save(StyleSetService set) {

    }
}
