package com.mikomaric.dentalassistant.domain.dto;

import java.util.Objects;

public class ToothSideLabelDto {

    private Long toothSideLabelID;
    private String name;
    private String description;

    public ToothSideLabelDto() {
    }

    public ToothSideLabelDto(Long toothSideLabelID, String name, String description) {
        this.toothSideLabelID = toothSideLabelID;
        this.name = name;
        this.description = description;
    }

    public Long getToothSideLabelID() {
        return toothSideLabelID;
    }

    public void setToothSideLabelID(Long toothSideLabelID) {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.toothSideLabelID);
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
        final ToothSideLabelDto other = (ToothSideLabelDto) obj;
        if (!Objects.equals(this.toothSideLabelID, other.toothSideLabelID)) {
            return false;
        }
        return true;
    }
}
