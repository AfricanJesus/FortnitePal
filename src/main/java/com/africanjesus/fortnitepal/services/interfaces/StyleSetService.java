package com.africanjesus.fortnitepal.services.interfaces;

import com.africanjesus.fortnitepal.model.documents.StyleSet;

import java.util.List;

public interface StyleSetService {

    void save(StyleSet set);
    List<StyleSet> findAll();
}
