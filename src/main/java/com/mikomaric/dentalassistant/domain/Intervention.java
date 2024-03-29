package com.mikomaric.dentalassistant.domain;

import java.util.Date;
import java.util.List;

public class Intervention{

    private String interventionID;
    private Date date;
    private String note;
    private List<InterventionItem> items;
    private User user;

    public Intervention() {
    }
    
    public Intervention(String interventionID) {
    }
    public Intervention(String interventionID, Date date, String note, List<InterventionItem> items, User user) {
        this.date = date;
        this.note = note;
        this.items = items;
        this.user = user;
    }
    public Intervention(Date date, String note,User user) {
        this();
        this.date = date;
        this.note = note;
        this.user = user;
    }
    
    public String getInterventionID() {
        return interventionID;
    }

    public void setInterventionID(String interventionID) {
        this.interventionID = interventionID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<InterventionItem> getItems() {
        return items;
    }

    public void setItems(List<InterventionItem> items) {
        this.items = items;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
