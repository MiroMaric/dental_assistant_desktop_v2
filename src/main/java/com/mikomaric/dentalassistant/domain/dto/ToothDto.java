package com.mikomaric.dentalassistant.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ToothDto {

    private Long toothID;
    private PatientDto patient;
    private ToothLabelDto toothLabel;
    private List<ToothRootDto> toothRoots;
    private List<ToothSideDto> toothSides;
    private List<ToothInterventionDto> toothInterventions;

    public ToothDto() {
    }

    public ToothDto(Long toothID, PatientDto patient, ToothLabelDto toothLabel, List<ToothRootDto> toothRoots, List<ToothSideDto> toothSides, List<ToothInterventionDto> toothInterventions) {
        this.toothID = toothID;
        this.patient = patient;
        this.toothLabel = toothLabel;
        this.toothRoots = toothRoots;
        this.toothSides = toothSides;
        this.toothInterventions = toothInterventions;
    }

    public Long getToothID() {
        return toothID;
    }

    public void setToothID(Long toothID) {
        this.toothID = toothID;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public ToothLabelDto getToothLabel() {
        return toothLabel;
    }

    public void setToothLabel(ToothLabelDto toothLabel) {
        this.toothLabel = toothLabel;
    }

    public List<ToothRootDto> getToothRoots() {
        return toothRoots;
    }

    public void setToothRoots(List<ToothRootDto> toothRoots) {
        this.toothRoots = toothRoots;
    }

    public List<ToothSideDto> getToothSides() {
        return toothSides;
    }

    public void setToothSides(List<ToothSideDto> toothSides) {
        this.toothSides = toothSides;
    }

    public List<ToothInterventionDto> getToothInterventions() {
        return toothInterventions;
    }

    public void setToothInterventions(List<ToothInterventionDto> toothInterventions) {
        this.toothInterventions = toothInterventions;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.toothID);
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
        final ToothDto other = (ToothDto) obj;
        if (!Objects.equals(this.toothID, other.toothID)) {
            return false;
        }
        return true;
    }
    
}
