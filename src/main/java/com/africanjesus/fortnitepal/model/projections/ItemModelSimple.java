package com.africanjesus.fortnitepal.model.projections;

import com.africanjesus.fortnitepal.RarityType;
import com.africanjesus.fortnitepal.model.Item;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="itemModelSimple", types = {Item.class})
public interface ItemModelSimple {

    String getName();
    RarityType getRarityType();
    String getImage();

}
