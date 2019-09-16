package com.mikomaric.dentalassistant.domain;

public class ToothSideState{

    private int toothSideStateID;
    private String name;
    private String description;
    private int color;

    public ToothSideState() {
    }


    public ToothSideState(int toothSideStateID, String name, String description, int color) {
        this.toothSideStateID = toothSideStateID;
        this.name = name;
        this.description = description;
        this.color = color;
    }

    public ToothSideState(int toothSideStateID) {
        this.toothSideStateID = toothSideStateID;
    }

    public int getToothSideStateID() {
        return toothSideStateID;
    }

    public void setToothSideStateID(int toothSideStateID) {
        this.toothSideStateID = toothSideStateID;
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

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
