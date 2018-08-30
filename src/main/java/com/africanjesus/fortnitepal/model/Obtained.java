package com.africanjesus.fortnitepal.model;

import javax.persistence.Embeddable;

@Embeddable
public class Obtained {

    private int season;

    private int tier;

    private String promo;

    private String includedIn;

    private int vbuckPrice;

    private double price;

    private String challenege;

    public Obtained() {
    }

    public Obtained(int season, int tier, String promo, String includedIn, int vbuckPrice, double price, String challenege) {
        this.season = season;
        this.tier = tier;
        this.promo = promo;
        this.includedIn = includedIn;
        this.vbuckPrice = vbuckPrice;
        this.price = price;
        this.challenege = challenege;
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

    public String getIncludedIn() {
        return includedIn;
    }

    public void setIncludedIn(String includedIn) {
        this.includedIn = includedIn;
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

    public String getChallenege() {
        return challenege;
    }

    public void setChallenege(String challenege) {
        this.challenege = challenege;
    }

    @Override
    public String toString() {
        return "Obtained{" +
                "season=" + season +
                ", tier=" + tier +
                ", promo='" + promo + '\'' +
                ", includedIn='" + includedIn + '\'' +
                ", vbuckPrice=" + vbuckPrice +
                ", price=" + price +
                ", challenege='" + challenege + '\'' +
                '}';
    }
}
