
package com.mikomaric.dentalassistant.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class InterventionItemDto {

    protected Long itemID;
    protected InterventionDto intervention;
    protected String note;

    public InterventionItemDto() {
    }

    public InterventionItemDto(Long interventionItemID, InterventionDto intervention, String note) {
        this.itemID = interventionItemID;
        this.intervention = intervention;
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
    }

    public InterventionDto getIntervention() {
        return intervention;
    }

    public void setIntervention(InterventionDto intervention) {
        this.intervention = intervention;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.itemID);
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
        final InterventionItemDto other = (InterventionItemDto) obj;
        if (!Objects.equals(this.itemID, other.itemID)) {
            return false;
        }
        return true;
    }
}
