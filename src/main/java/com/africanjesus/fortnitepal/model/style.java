package com.africanjesus.fortnitepal.model;

import javax.persistence.Embeddable;
import java.util.ArrayList;
import java.util.Map;

@Embeddable
public class style {

    private String styleName;

    private ArrayList<challenge> challenges;

    public style() {
    }

    public style(String styleName, ArrayList<challenge> challenges) {
        this.styleName = styleName;
        this.challenges = challenges;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public ArrayList<challenge> getChallenges() {
        return challenges;
    }

    public void setChallenges(ArrayList<challenge> challenges) {
        this.challenges = challenges;
    }

    @Override
    public String toString() {
        return "style{" +
                "styleName='" + styleName + '\'' +
                ", challenges=" + challenges +
                '}';
    }
}
