package com.mikomaric.dentalassistant.domain;

public class RootIntervention extends InterventionItem {

    private ToothRoot toothRoot;
    private ToothRootState toothRootState;

    public RootIntervention(Intervention intervention, String note, ToothRoot toothRoot, ToothRootState toothRootState) {
        super(intervention, note);
        this.toothRoot = toothRoot;
        this.toothRootState = toothRootState;
    }

    public RootIntervention() {
    }

    public RootIntervention(String itemID, ToothRootState state) {
        super(itemID);
        this.toothRootState = state;
    }

    public RootIntervention(String itemID, ToothRootState state, Intervention intervention) {
        this(itemID, state);
        this.intervention = intervention;
    }

    public ToothRoot getToothRoot() {
        return toothRoot;
    }

    public void setToothRoot(ToothRoot toothRoot) {
        this.toothRoot = toothRoot;
    }

    public ToothRootState getToothRootState() {
        return toothRootState;
    }

    public void setToothRootState(ToothRootState toothRootState) {
        this.toothRootState = toothRootState;
    }

    @Override
    public String getToothLabel() {
        return toothRoot.getTooth().getLabel().toString();
    }

    @Override
    public String getStateLabel() {
        return getToothRootState().getName();
    }

    @Override
    public String getItemLabel() {
        return toothRoot.getLabel().getName();
    }

}
