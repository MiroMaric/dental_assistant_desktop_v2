package com.mikomaric.dentalassistant.domain;
import java.util.List;
import java.util.UUID;

public class ToothRoot{

    private String toothRootID;
    private Tooth tooth;
    private ToothRootLabel label;
    private List<RootIntervention> rootInterventions;

    public ToothRoot() {
    }

    public ToothRoot(String toothRootID, Tooth tooth, ToothRootLabel label, List<RootIntervention> rootInterventions) {
        this.toothRootID = toothRootID;
        this.tooth = tooth;
        this.label = label;
        this.rootInterventions = rootInterventions;
    }

    public ToothRoot(Tooth tooth, ToothRootLabel label) {
        toothRootID = UUID.randomUUID().toString();
        this.tooth = tooth;
        this.label = label;
    }

    private ToothRoot(String toothRootID, Tooth tooth, ToothRootLabel toothRootLabel) {
        this.toothRootID = toothRootID;
        this.tooth = tooth;
        this.label = toothRootLabel;
    }

    public String getToothRootID() {
        return toothRootID;
    }

    public void setToothRootID(String toothRootID) {
        this.toothRootID = toothRootID;
    }

    public Tooth getTooth() {
        return tooth;
    }

    public void setTooth(Tooth tooth) {
        this.tooth = tooth;
    }

    public ToothRootLabel getLabel() {
        return label;
    }

    public void setLabel(ToothRootLabel label) {
        this.label = label;
    }

    public List<RootIntervention> getRootInterventions() {
        return rootInterventions;
    }

    public void setRootInterventions(List<RootIntervention> rootInterventions) {
        this.rootInterventions = rootInterventions;
    }
}
