package com.africanjesus.fortnitepal.model.projections;

import com.africanjesus.fortnitepal.RarityType;
import com.africanjesus.fortnitepal.model.documents.Item;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="searchItemModel", types = {Item.class})
public interface SearchItemModel {

    String getName();
    RarityType getItemType();
    Long getId();
}
