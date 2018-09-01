package com.africanjesus.fortnitepal.model;


import javax.persistence.Embeddable;

@Embeddable
public class Style {


    private String styleName;

    private String styleItem;

    private String styleItemImage;

    public Style() {
    }

    public Style(String styleName, String styleItem, String styleItemImage) {
        this.styleName = styleName;
        this.styleItem = styleItem;
        this.styleItemImage = styleItemImage;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getStyleItem() {
        return styleItem;
    }

    public void setStyleItem(String styleItem) {
        this.styleItem = styleItem;
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
                ", styleItem='" + styleItem + '\'' +
                ", styleItemImage='" + styleItemImage + '\'' +
                '}';
    }
}
