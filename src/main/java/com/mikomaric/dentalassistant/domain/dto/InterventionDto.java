package com.mikomaric.dentalassistant.domain.dto;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class InterventionDto {

    private Long interventionID;
    private Date date;
    private UserDto user;
    private List<InterventionItemDto> items;
    private String note;

    public InterventionDto() {
    }

    public InterventionDto(Long interventionID, Date date, UserDto user, List<InterventionItemDto> items, String note) {
        this.interventionID = interventionID;
        this.date = date;
        this.user = user;
        this.items = items;
        this.note = note;
    }

    public Long getInterventionID() {
        return interventionID;
    }

    public void setInterventionID(Long interventionID) {
        this.interventionID = interventionID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public List<InterventionItemDto> getItems() {
        return items;
    }

    public void setItems(List<InterventionItemDto> items) {
        this.items = items;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.interventionID);
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
        final InterventionDto other = (InterventionDto) obj;
        if (!Objects.equals(this.interventionID, other.interventionID)) {
            return false;
        }
        return true;
    }
    
}
