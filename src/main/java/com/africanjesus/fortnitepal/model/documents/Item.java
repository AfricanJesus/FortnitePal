package com.africanjesus.fortnitepal.model.documents;

import com.africanjesus.fortnitepal.ItemType;
import com.africanjesus.fortnitepal.RarityType;
import com.africanjesus.fortnitepal.ReleaseStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Document(collection = "Items")
public class Item {

    @Id
    private String _id;

    private int id;

    private String name;

    private String desc;

    private RarityType rarityType;

    private List<String> images = new ArrayList<>();

    private Obtained obtained;

    private String styleSet;

    private String set;

    private ItemType itemType;

    private ReleaseStatus status;

    public Item() {
    }

    public Item(String name, String desc, RarityType rarityType, List images, Obtained obtained, String styleSet, String set, ItemType itemType, ReleaseStatus status) {
        this.name = name;
        this.desc = desc;
        this.rarityType = rarityType;
        this.images = images;
        this.obtained = obtained;
        this.styleSet = styleSet;
        this.set = set;
        this.itemType = itemType;
        this.status = status;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public RarityType getRarityType() {
        return rarityType;
    }

    public void setRarityType(RarityType rarityType) {
        this.rarityType = rarityType;
    }

    public List getImages() {
        return images;
    }

    public void setImages(List images) {
        this.images = images;
    }

    public Obtained getObtained() {
        return obtained;
    }

    public void setObtained(Obtained obtained) {
        this.obtained = obtained;
    }

    public String getStyleSet() {
        return styleSet;
    }

    public void setStyleSet(String styleSet) {
        this.styleSet = styleSet;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public ReleaseStatus getStatus() {
        return status;
    }

    public void setStatus(ReleaseStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) &&
                Objects.equals(desc, item.desc) &&
                rarityType == item.rarityType &&
                Objects.equals(images, item.images) &&
                Objects.equals(obtained, item.obtained) &&
                Objects.equals(styleSet, item.styleSet) &&
                Objects.equals(set, item.set) &&
                itemType == item.itemType &&
                status == item.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, desc, rarityType, images, obtained, styleSet, set, itemType, status);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", rarityType=" + rarityType +
                ", images=" + images +
                ", obtained=" + obtained +
                ", styleSet='" + styleSet + '\'' +
                ", set='" + set + '\'' +
                ", itemType=" + itemType +
                ", status=" + status +
                '}';
    }
}
