package com.mikomaric.dentalassistant.domain.dto;

import java.util.Objects;

public class ToothLabelDto {

    private Long toothLabelID;
    private int number;
    private int quadrant;
    private int numOfRoots;
    private String description;

    public ToothLabelDto() {
    }

    public ToothLabelDto(Long toothLabelID, int number, int quadrant, int numOfRoots, String description) {
        this.toothLabelID = toothLabelID;
        this.number = number;
        this.quadrant = quadrant;
        this.numOfRoots = numOfRoots;
        this.description = description;
    }

    public Long getToothLabelID() {
        return toothLabelID;
    }

    public void setToothLabelID(Long toothLabelID) {
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
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.toothLabelID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ToothLabelDto other = (ToothLabelDto) obj;
        if (!Objects.equals(this.toothLabelID, other.toothLabelID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ToothLabel{" + "toothLabelID=" + toothLabelID + '}';
    }
}
