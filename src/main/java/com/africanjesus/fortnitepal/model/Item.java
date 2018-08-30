package com.africanjesus.fortnitepal.model;

import com.africanjesus.fortnitepal.ItemType;
import com.africanjesus.fortnitepal.RarityType;
import com.africanjesus.fortnitepal.ReleaseStatus;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "item_desc")
    private String desc;

    @Column(name = "item_rarity_type")
    private RarityType rarityType;

    @Column(name = "item_name")
    private String image;

    private Obtained obtained;

    @Column(name = "item_set")
    private String set;

    @Column(name = "item_type")
    private ItemType itemType;

    private ReleaseStatus status;

    public Item() {
    }

    public Item(String name, String desc, RarityType rarityType, String image, Obtained obtained, String set, ItemType itemType, ReleaseStatus status) {
        this.name = name;
        this.desc = desc;
        this.rarityType = rarityType;
        this.image = image;
        this.obtained = obtained;
        this.set = set;
        this.itemType = itemType;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Obtained getObtained() {
        return obtained;
    }

    public void setObtained(Obtained obtained) {
        this.obtained = obtained;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", rarityType=" + rarityType +
                ", image='" + image + '\'' +
                ", obtained=" + obtained +
                ", set='" + set + '\'' +
                ", itemType=" + itemType +
                ", status=" + status +
                '}';
    }
}
