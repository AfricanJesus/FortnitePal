package com.africanjesus.fortnitepal.model.documents;

import javax.persistence.Embeddable;

@Embeddable
public class Obtained {

    private int season;

    private int tier;

    private String promo;

    private String includedInName;

    private int vbuckPrice;

    private double price;

    private String challenge;

    public Obtained() {
    }

    public Obtained(int season, int tier, String promo, String includedInName, int vbuckPrice, double price, String challenge) {
        this.season = season;
        this.tier = tier;
        this.promo = promo;
        this.includedInName = includedInName;
        this.vbuckPrice = vbuckPrice;
        this.price = price;
        this.challenge = challenge;
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

    public String getIncludedInName() {
        return includedInName;
    }

    public void setIncludedInName(String includedInName) {
        this.includedInName = includedInName;
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

    public String getChallenge() {
        return challenge;
    }

    public void setChallenege(String challenge) {
        this.challenge = challenge;
    }

    @Override
    public String toString() {
        return "Obtained{" +
                "season=" + season +
                ", tier=" + tier +
                ", promo='" + promo + '\'' +
                ", includedInName='" + includedInName + '\'' +
                ", vbuckPrice=" + vbuckPrice +
                ", price=" + price +
                ", challenege='" + challenge + '\'' +
                '}';
    }
}
