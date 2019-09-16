package com.mikomaric.dentalassistant.domain.dto;

import java.util.Objects;

public class ToothSideStateDto {

    private Long toothSideStateID;
    private String name;
    private String color;
    private String description;

    public ToothSideStateDto() {
    }

    public ToothSideStateDto(Long toothSideStateID, String name, String color, String description) {
        this.toothSideStateID = toothSideStateID;
        this.name = name;
        this.color = color;
        this.description = description;
    }

    public Long getToothSideStateID() {
        return toothSideStateID;
    }

    public void setToothSideStateID(Long toothSideStateID) {
        this.toothSideStateID = toothSideStateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.toothSideStateID);
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
        final ToothSideStateDto other = (ToothSideStateDto) obj;
        if (!Objects.equals(this.toothSideStateID, other.toothSideStateID)) {
            return false;
        }
        return true;
    }
    
}
