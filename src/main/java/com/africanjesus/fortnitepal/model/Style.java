package com.africanjesus.fortnitepal.model;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import java.util.ArrayList;
import java.util.List;

@Embeddable
public class Style {

    private String styleName;

    @ElementCollection
    @CollectionTable(name = "challenges", joinColumns = @JoinColumn(name = "items_id"))
    private List<Challenge> Challenges = new ArrayList<>();

    public Style() {
    }

    public Style(String styleName, ArrayList<Challenge> Challenges) {
        this.styleName = styleName;
        this.Challenges = Challenges;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public List<Challenge> getChallenges() {
        return Challenges;
    }

    public void setChallenges(ArrayList<Challenge> Challenges) {
        this.Challenges = Challenges;
    }

    @Override
    public String toString() {
        return "Style{" +
                "styleName='" + styleName + '\'' +
                ", Challenges=" + Challenges +
                '}';
    }
}
