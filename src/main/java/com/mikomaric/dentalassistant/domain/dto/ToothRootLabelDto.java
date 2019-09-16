package com.mikomaric.dentalassistant.domain.dto;

import java.util.Objects;

public class ToothRootLabelDto {

    private Long toothRootLabelID;
    private String name;
    private String description;

    public ToothRootLabelDto() {
    }

    public ToothRootLabelDto(Long toothRootLabelID, String name, String description) {
        this.toothRootLabelID = toothRootLabelID;
        this.name = name;
        this.description = description;
    }

    public Long getToothRootLabelID() {
        return toothRootLabelID;
    }

    public void setToothRootLabelID(Long toothRootLabelID) {
        this.toothRootLabelID = toothRootLabelID;
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
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.toothRootLabelID);
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
        final ToothRootLabelDto other = (ToothRootLabelDto) obj;
        if (!Objects.equals(this.toothRootLabelID, other.toothRootLabelID)) {
            return false;
        }
        return true;
    }
}
