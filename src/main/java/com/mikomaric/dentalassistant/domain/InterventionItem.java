package com.mikomaric.dentalassistant.domain;

public abstract class InterventionItem{

    protected String itemID;
    protected Intervention intervention;
    protected String note;

    public InterventionItem() {
    }

    public InterventionItem(String itemID) {
        this.itemID = itemID;
    }

    public InterventionItem(Intervention intervention, String note) {
        this();
        this.intervention = intervention;
        this.note = note;
    }

    public InterventionItem(String itemID, Intervention intervention, String note) {
        this.itemID = itemID;
        this.intervention = intervention;
        this.note = note;
    }

    public abstract String getToothLabel();

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public Intervention getIntervention() {
        return intervention;
    }

    public void setIntervention(Intervention intervention) {
        this.intervention = intervention;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public abstract String getStateLabel();

    public abstract String getItemLabel();
}
