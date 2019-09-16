package com.mikomaric.dentalassistant.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ToothInterventionDto extends InterventionItemDto{
    private ToothDto tooth;
    private ToothStateDto toothState;

    public ToothInterventionDto() {
    }

    public ToothInterventionDto(ToothDto tooth, ToothStateDto toothState, Long interventionItemID, InterventionDto intervention, String note) {
        super(interventionItemID, intervention, note);
        this.tooth = tooth;
        this.toothState = toothState;
    }

    public ToothDto getTooth() {
        return tooth;
    }

    public void setTooth(ToothDto tooth) {
        this.tooth = tooth;
    }

    public ToothStateDto getToothState() {
        return toothState;
    }

    public void setToothState(ToothStateDto toothState) {
        this.toothState = toothState;
    }
}
