package com.mikomaric.dentalassistant.domain;

public class ToothIntervention extends InterventionItem{

    private Tooth tooth;
    private ToothState state;

    public ToothIntervention(Intervention intervention, String note, Tooth tooth, ToothState state) {
        super(intervention, note);
        this.tooth = tooth;
        this.state = state;
    }

    public ToothIntervention(String itemID, ToothState state) {
        super(itemID);
        this.state = state;
    }

    public ToothIntervention(String itemID, ToothState state, Intervention intervention) {
        this(itemID, state);
        this.intervention = intervention;
    }
    
    public ToothIntervention() {

    }
    
    @Override
    public String getToothLabel() {
        return getTooth().getLabel().toString();
    }

    public Tooth getTooth() {
        return tooth;
    }

    public void setTooth(Tooth tooth) {
        this.tooth = tooth;
    }

    public ToothState getState() {
        return state;
    }

    public void setState(ToothState state) {
        this.state = state;
    }

    @Override
    public String getStateLabel() {
        return state.getName();
    }

    @Override
    public String getItemLabel() {
        return tooth.getLabel().getQuadrant()+""+tooth.getLabel().getNumber();
    }
}
