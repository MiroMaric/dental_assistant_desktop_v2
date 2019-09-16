package com.mikomaric.dentalassistant.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ToothSideDto {
    private Long toothSideID;
    private ToothDto tooth;
    private ToothSideLabelDto sideLabel;
    private List<SideInterventionDto> sideInterventions;

    public ToothSideDto() {
    }

    public ToothSideDto(Long toothSideID, ToothDto tooth, ToothSideLabelDto sideLabel, List<SideInterventionDto> sideInterventions) {
        this.toothSideID = toothSideID;
        this.tooth = tooth;
        this.sideLabel = sideLabel;
        this.sideInterventions = sideInterventions;
    }

    public Long getToothSideID() {
        return toothSideID;
    }

    public void setToothSideID(Long toothSideID) {
        this.toothSideID = toothSideID;
    }

    public ToothDto getTooth() {
        return tooth;
    }

    public void setTooth(ToothDto tooth) {
        this.tooth = tooth;
    }

    public ToothSideLabelDto getSideLabel() {
        return sideLabel;
    }

    public void setSideLabel(ToothSideLabelDto sideLabel) {
        this.sideLabel = sideLabel;
    }

    public List<SideInterventionDto> getSideInterventions() {
        return sideInterventions;
    }

    public void setSideInterventions(List<SideInterventionDto> sideInterventions) {
        this.sideInterventions = sideInterventions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.toothSideID);
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
        final ToothSideDto other = (ToothSideDto) obj;
        if (!Objects.equals(this.toothSideID, other.toothSideID)) {
            return false;
        }
        return true;
    }
}
