package com.africanjesus.fortnitepal.model.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Document(collection = "Style Sets")
public class StyleSet {

    @Id
    private String _id;

    private String styleSetName;

    private List<Style> stages = new ArrayList();

    public StyleSet() {
    }

    public StyleSet(String styleSetName, List<Style> stages) {
        this.styleSetName = styleSetName;
        this.stages = stages;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getStyleSetName() {
        return styleSetName;
    }

    public void setStyleSetName(String styleSetName) {
        this.styleSetName = styleSetName;
    }

    public List<Style> getStages() {
        return stages;
    }

    public void setStages(List<Style> stages) {
        this.stages = stages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StyleSet)) return false;
        StyleSet styleSet = (StyleSet) o;
        return Objects.equals(styleSetName, styleSet.styleSetName) &&
                Objects.equals(stages, styleSet.stages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(styleSetName, stages);
    }

    @Override
    public String toString() {
        return "StyleSet{" +
                ", styleSetName='" + styleSetName + '\'' +
                ", stages=" + stages +
                '}';
    }
}
