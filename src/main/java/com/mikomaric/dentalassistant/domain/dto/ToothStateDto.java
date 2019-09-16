package com.mikomaric.dentalassistant.domain.dto;

import java.util.Objects;

public class ToothStateDto {

    private Long toothStateID;
    private String name;
    private String color;
    private String description;

    public ToothStateDto() {
    }

    public ToothStateDto(Long toothStateID, String name, String color, String description) {
        this.toothStateID = toothStateID;
        this.name = name;
        this.color = color;
        this.description = description;
    }

    public Long getToothStateID() {
        return toothStateID;
    }

    public void setToothStateID(Long toothStateID) {
        this.toothStateID = toothStateID;
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
        hash = 97 * hash + Objects.hashCode(this.toothStateID);
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
        final ToothStateDto other = (ToothStateDto) obj;
        if (!Objects.equals(this.toothStateID, other.toothStateID)) {
            return false;
        }
        return true;
    }
}
