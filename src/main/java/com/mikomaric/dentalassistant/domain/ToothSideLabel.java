package com.mikomaric.dentalassistant.domain;

public class ToothSideLabel{
    
    private String toothSideLabelID;
    private String name;
    private String description;

    public ToothSideLabel() {
    }

    public ToothSideLabel(String toothSideLabelID, String name, String description) {
        this.toothSideLabelID = toothSideLabelID;
        this.name = name;
        this.description = description;
    }

    ToothSideLabel(String toothSideLabelID) {
        this.toothSideLabelID = toothSideLabelID;
    }

    public String getToothSideLabelID() {
        return toothSideLabelID;
    }

    public void setToothSideLabelID(String toothSideLabelID) {
        this.toothSideLabelID = toothSideLabelID;
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
