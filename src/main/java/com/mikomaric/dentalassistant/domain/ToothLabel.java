package com.mikomaric.dentalassistant.domain;

public class ToothLabel{

    private String toothLabelID;
    private int number;
    private int quadrant;
    private int numOfRoots;
    private String description;

    public ToothLabel() {
    }
    
    public ToothLabel(String toothLabelID) {
        this.toothLabelID = toothLabelID;
    }
    
    public ToothLabel(String toothLabelID, int number, int quadrant, int numOfRoots, String description) {
        this.toothLabelID = toothLabelID;
        this.number = number;
        this.quadrant = quadrant;
        this.numOfRoots = numOfRoots;
        this.description = description;
    }

    public String getToothLabelID() {
        return toothLabelID;
    }

    public void setToothLabelID(String toothLabelID) {
        this.toothLabelID = toothLabelID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuadrant() {
        return quadrant;
    }

    public void setQuadrant(int quadrant) {
        this.quadrant = quadrant;
    }

    public int getNumOfRoots() {
        return numOfRoots;
    }

    public void setNumOfRoots(int numOfRoots) {
        this.numOfRoots = numOfRoots;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return quadrant+""+number;
    }

}
