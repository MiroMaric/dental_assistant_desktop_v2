package com.mikomaric.dentalassistant.domain;

public class ToothRootState{
    private int toothRootStateID;
    private String name;
    private String description;
    private int color;

    public ToothRootState() {
    }

    public ToothRootState(int toothRootStateID, String name, String description, int color) {
        this.toothRootStateID = toothRootStateID;
        this.name = name;
        this.description = description;
        this.color = color;
    }

    public ToothRootState(int toothRootStateID) {
        this.toothRootStateID = toothRootStateID;
    }

    public int getToothRootStateID() {
        return toothRootStateID;
    }

    public void setToothRootStateID(int toothRootStateID) {
        this.toothRootStateID = toothRootStateID;
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
