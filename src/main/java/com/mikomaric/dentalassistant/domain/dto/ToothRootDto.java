package com.mikomaric.dentalassistant.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ToothRootDto {
    private Long toothRootID;
    private ToothDto tooth;
    private ToothRootLabelDto rootLabel;
    private List<RootInterventionDto> rootInterventions;

    public ToothRootDto() {
    }

    public ToothRootDto(Long toothRootID, ToothDto tooth, ToothRootLabelDto rootLabel,List<RootInterventionDto> rootInterventions) {
        this.toothRootID = toothRootID;
        this.tooth = tooth;
        this.rootLabel = rootLabel;
        this.rootInterventions = rootInterventions;
    }

    public Long getToothRootID() {
        return toothRootID;
    }

    public void setToothRootID(Long toothRootID) {
        this.toothRootID = toothRootID;
    }

    public ToothDto getTooth() {
        return tooth;
    }

    public void setTooth(ToothDto tooth) {
        this.tooth = tooth;
    }

    public ToothRootLabelDto getRootLabel() {
        return rootLabel;
    }

    public void setRootLabel(ToothRootLabelDto rootLabel) {
        this.rootLabel = rootLabel;
    }

    public List<RootInterventionDto> getRootInterventions() {
        return rootInterventions;
    }

    public void setRootInterventions(List<RootInterventionDto> rootInterventions) {
        this.rootInterventions = rootInterventions;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.toothRootID);
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
        final ToothRootDto other = (ToothRootDto) obj;
        if (!Objects.equals(this.toothRootID, other.toothRootID)) {
            return false;
        }
        return true;
    }
}
