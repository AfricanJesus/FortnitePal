package com.africanjesus.fortnitepal.services;

import com.africanjesus.fortnitepal.model.StyleSet;

import java.util.List;

public interface StyleSetService {

    void save(StyleSet set);
    List<StyleSet> findAll();
}
