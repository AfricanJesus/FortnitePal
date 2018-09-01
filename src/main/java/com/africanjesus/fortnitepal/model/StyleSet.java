package com.africanjesus.fortnitepal.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @ElementCollection
    @CollectionTable(name = "colors", joinColumns = @JoinColumn(name = "style_sets_id"))
    private Map<String, String> colors = new HashMap();

    public StyleSet() {
    }

    public StyleSet(String styleSetName, List<Style> stages, Map<String, String> colors) {
        this.styleSetName = styleSetName;
        this.stages = stages;
        this.colors = colors;
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

    public Map<String, String> getColors() {
        return colors;
    }

    public void setColors(Map<String, String> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "StyleSet{" +
                "id=" + id +
                ", styleSetName='" + styleSetName + '\'' +
                ", stages=" + stages +
                ", colors=" + colors +
                '}';
    }
}
