package com.mikomaric.dentalassistant.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class SideInterventionDto extends InterventionItemDto{
    private ToothSideDto toothSide;
    private ToothSideStateDto toothSideState;

    public SideInterventionDto() {
    }

    public SideInterventionDto(ToothSideDto toothSide, ToothSideStateDto toothSideState, Long interventionItemID, InterventionDto intervention, String note) {
        super(interventionItemID, intervention, note);
        this.toothSide = toothSide;
        this.toothSideState = toothSideState;
    }
    
    public ToothSideDto getToothSide() {
        return toothSide;
    }

    public void setToothSide(ToothSideDto toothSide) {
        this.toothSide = toothSide;
    }

    public ToothSideStateDto getToothSideState() {
        return toothSideState;
    }

    public void setToothSideState(ToothSideStateDto toothSideState) {
        this.toothSideState = toothSideState;
    }    
}
