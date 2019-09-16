package com.mikomaric.dentalassistant.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RootInterventionDto extends InterventionItemDto{
    private ToothRootDto toothRoot;
    private ToothRootStateDto toothRootState;

    public RootInterventionDto() {
    }

    public RootInterventionDto(ToothRootDto toothRoot, ToothRootStateDto toothRootState, Long interventionItemID, InterventionDto intervention, String note) {
        super(interventionItemID, intervention, note);
        this.toothRoot = toothRoot;
        this.toothRootState = toothRootState;
    }
    
    public ToothRootDto getToothRoot() {
        return toothRoot;
    }

    public void setToothRoot(ToothRootDto toothRoot) {
        this.toothRoot = toothRoot;
    }

    public ToothRootStateDto getToothRootState() {
        return toothRootState;
    }

    public void setToothRootState(ToothRootStateDto toothRootState) {
        this.toothRootState = toothRootState;
    }
    
    
}
