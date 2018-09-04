package com.africanjesus.fortnitepal.model;


import javax.persistence.Embeddable;

@Embeddable
public class Style {


    private String styleName;

    private String styleItemImage;

    public Style() {
    }

    public Style(String styleName, String styleItemImage) {
        this.styleName = styleName;
        this.styleItemImage = styleItemImage;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }


    public String getStyleItemImage() {
        return styleItemImage;
    }

    public void setStyleItemImage(String styleItemImage) {
        this.styleItemImage = styleItemImage;
    }

    @Override
    public String toString() {
        return "Style{" +
                "styleName='" + styleName + '\'' +
                ", styleItemImage='" + styleItemImage + '\'' +
                '}';
    }
}
