package com.africanjesus.fortnitepal.model;

import com.africanjesus.fortnitepal.ItemType;
import com.africanjesus.fortnitepal.RarityType;
import com.africanjesus.fortnitepal.ReleaseStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    @Column(name = "item_desc")
    private String desc;

    @Column(name = "item_rarity_type")
    private RarityType rarityType;

    @ElementCollection
    @CollectionTable(name = "item_images", joinColumns = @JoinColumn(name = "item_id"))
    private List<String> images = new ArrayList<>();

    private Obtained obtained;

    private String styleSet;

    @Column(name = "item_set")
    private String set;

    @Column(name = "item_type")
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

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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
    public String toString() {
        return "Item{" +
                "id=" + Id +
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
