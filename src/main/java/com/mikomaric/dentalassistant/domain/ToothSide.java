package com.mikomaric.dentalassistant.domain;

import java.util.List;
import java.util.UUID;

public class ToothSide{

    private String toothSideID;
    private Tooth tooth;
    private ToothSideLabel label;
    private List<SideIntervention> sideInterventions;

    public ToothSide() {
    }

    
    public ToothSide(String toothSideID, Tooth tooth, ToothSideLabel label,List<SideIntervention> sideInterventions) {
        this.toothSideID = toothSideID;
        this.tooth = tooth;
        this.label = label;
        this.sideInterventions = sideInterventions;
    }

    public ToothSide(Tooth tooth,ToothSideLabel label) {
        toothSideID = UUID.randomUUID().toString();
        this.tooth = tooth;
        this.label = label;
    }
    
    public ToothSide(String toothSideID,Tooth tooth,ToothSideLabel label) {
        this.toothSideID = toothSideID;
        this.tooth = tooth;
        this.label = label;
    }
    
    public String getToothSideID() {
        return toothSideID;
    }

    public void setToothSideID(String toothSideID) {
        this.toothSideID = toothSideID;
    }

    public ToothSideLabel getLabel() {
        return label;
    }

    public void setLabel(ToothSideLabel label) {
        this.label = label;
    }

    public List<SideIntervention> getSideInterventions() {
        return sideInterventions;
    }
        
    public void setSideInterventions(List<SideIntervention> sideInterventions) {
        this.sideInterventions = sideInterventions;
    }

    public Tooth getTooth() {
        return tooth;
    }

    public void setTooth(Tooth tooth) {
        this.tooth = tooth;
    }
}
