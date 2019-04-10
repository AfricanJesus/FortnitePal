package com.africanjesus.fortnitepal.model.documents;


import javax.persistence.Embeddable;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Style)) return false;
        Style style = (Style) o;
        return Objects.equals(styleName, style.styleName) &&
                Objects.equals(styleItemImage, style.styleItemImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(styleName, styleItemImage);
    }

    @Override
    public String toString() {
        return "Style{" +
                "styleName='" + styleName + '\'' +
                ", styleItemImage='" + styleItemImage + '\'' +
                '}';
    }
}
