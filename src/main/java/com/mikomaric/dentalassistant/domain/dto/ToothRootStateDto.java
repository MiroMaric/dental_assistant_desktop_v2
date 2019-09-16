package com.mikomaric.dentalassistant.domain.dto;

import java.util.Objects;

public class ToothRootStateDto {

    private Long toothRootStateID;
    private String name;
    private String color;
    private String description;

    public ToothRootStateDto() {
    }

    public ToothRootStateDto(Long toothRootStateID, String name, String color, String description) {
        this.toothRootStateID = toothRootStateID;
        this.name = name;
        this.color = color;
        this.description = description;
    }

    public Long getToothRootStateID() {
        return toothRootStateID;
    }

    public void setToothRootStateID(Long toothRootStateID) {
        this.toothRootStateID = toothRootStateID;
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
        hash = 29 * hash + Objects.hashCode(this.toothRootStateID);
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
        final ToothRootStateDto other = (ToothRootStateDto) obj;
        if (!Objects.equals(this.toothRootStateID, other.toothRootStateID)) {
            return false;
        }
        return true;
    }
}
