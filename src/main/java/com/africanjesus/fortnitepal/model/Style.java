package com.africanjesus.fortnitepal.model;

import javax.persistence.Embeddable;
import java.util.ArrayList;

@Embeddable
public class Style {

    private String styleName;

    private ArrayList<Challenge> Challenges;

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

    public ArrayList<Challenge> getChallenges() {
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
