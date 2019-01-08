package com.africanjesus.fortnitepal.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "style_sets")
public class StyleSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String styleSetName;

    @ElementCollection
    @CollectionTable(name = "stages", joinColumns = @JoinColumn(name = "style_sets_id"))
    private List<Style> stages = new ArrayList();


    public StyleSet() {
    }

    public StyleSet(String styleSetName, List<Style> stages) {
        this.styleSetName = styleSetName;
        this.stages = stages;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                "id=" + id +
                ", styleSetName='" + styleSetName + '\'' +
                ", stages=" + stages +
                '}';
    }
}
