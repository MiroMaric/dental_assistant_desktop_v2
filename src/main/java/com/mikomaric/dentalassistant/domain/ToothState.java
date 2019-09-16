
package com.mikomaric.dentalassistant.domain;

public class ToothState{
    
    private int toothStateID;
    private String name;
    private String description;
    private int color;
    
    public ToothState() {
    }

    public ToothState(int toothStateID) {
        this.toothStateID = toothStateID;
    }
    
    public ToothState(String name) {
        this.name = name;
    }
    
    public ToothState(int toothStateID, String name, String description, int color) {
        this.toothStateID = toothStateID;
        this.name = name;
        this.description = description;
        this.color = color;
    }
    
     public int getToothStateID() {
        return toothStateID;
    }

    public void setToothStateID(int toothStateID) {
        this.toothStateID = toothStateID;
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
    
    @Override
    public String toString() {
        return getName();
    }

    
}
