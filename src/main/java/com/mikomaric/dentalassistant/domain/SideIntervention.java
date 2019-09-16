package com.mikomaric.dentalassistant.domain;

public class SideIntervention extends InterventionItem{

    private ToothSide toothSide;
    private ToothSideState state;

    public SideIntervention(Intervention intervention, String note, ToothSide toothSide, ToothSideState state) {
        super(intervention, note);
        this.toothSide = toothSide;
        this.state = state;
    }

    public SideIntervention(String itemID, ToothSideState state) {
        super(itemID);
        this.state = state;
    }

    public SideIntervention(String itemID, ToothSideState state, Intervention intervention) {
        this(itemID, state);
        this.intervention = intervention;
    }
    
    public SideIntervention() {

    }

    @Override
    public String getToothLabel() {
        return toothSide.getTooth().getLabel().toString();
    }

    public ToothSide getToothSide() {
        return toothSide;
    }

    public void setToothSide(ToothSide tooth) {
        this.toothSide = tooth;
    }

    public ToothSideState getState() {
        return state;
    }

    public void setState(ToothSideState state) {
        this.state = state;
    }

    @Override
    public String getStateLabel() {
        return state.getName();
    }

    @Override
    public String getItemLabel() {
        return toothSide.getLabel().getName();
    }

}
