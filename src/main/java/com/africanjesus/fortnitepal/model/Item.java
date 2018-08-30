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

    private int season;

    private int tier;

    private String promo;

    private int vbuckPrice;

    private double price;

    @Column(name = "item_set")
    private String set;

    @Column(name = "item_type")
    private ItemType itemType;

    private ReleaseStatus status;

    public Item() {
    }

    public Item(String name, String desc, RarityType rarityType, String image, int season, int tier, String promo, int vbuckPrice, double price, String set, ItemType itemType, ReleaseStatus status) {
        this.name = name;
        this.desc = desc;
        this.rarityType = rarityType;
        this.image = image;
        this.season = season;
        this.tier = tier;
        this.promo = promo;
        this.vbuckPrice = vbuckPrice;
        this.price = price;
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

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public int getVbuckPrice() {
        return vbuckPrice;
    }

    public void setVbuckPrice(int vbuckPrice) {
        this.vbuckPrice = vbuckPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
                ", season='" + season + '\'' +
                ", tier='" + tier + '\'' +
                ", promo='" + promo + '\'' +
                ", vbuckPrice=" + vbuckPrice +
                ", price=" + price +
                ", set='" + set + '\'' +
                ", itemType=" + itemType +
                ", status=" + status +
                '}';
    }
}
