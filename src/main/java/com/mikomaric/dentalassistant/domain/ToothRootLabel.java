package com.mikomaric.dentalassistant.domain;

public class ToothRootLabel{
    private String toothRootLabelID;
    private String name;
    private String description;

    public ToothRootLabel() {
    }

    public ToothRootLabel(String toothRootLabelID, String name, String description) {
        this.toothRootLabelID = toothRootLabelID;
        this.name = name;
        this.description = description;
    }

    ToothRootLabel(String toothRootLabelID) {
        this.toothRootLabelID = toothRootLabelID;
    }

    public String getToothRootLabelID() {
        return toothRootLabelID;
    }

    public void setToothRootLabelID(String toothRootLabelID) {
        this.toothRootLabelID = toothRootLabelID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
