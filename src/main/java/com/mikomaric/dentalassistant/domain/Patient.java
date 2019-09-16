package com.mikomaric.dentalassistant.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Patient extends Person {

    private String patientID;
    private Date birthDate;
    private Date cardboardDate;
    private boolean deactivated;
    private List<Tooth> teeth;

    public Patient() {
    }

    public Patient(String firstname, String lastname, String email, String adress, String phone, Date birthDate, Date cardboardDate) {
        super(firstname, lastname, email, adress, phone);
        this.birthDate = birthDate;
        this.cardboardDate = cardboardDate;
        this.deactivated = false;
        this.patientID = UUID.randomUUID().toString();
    }

    public Patient(String patientID, String firstname, String lastname, String email, String adress, String phone, Date birthDate, Date cardboardDate, boolean deactivated) {
        this(firstname, lastname, email, adress, phone, birthDate, cardboardDate);
        this.patientID = patientID;
        this.deactivated = deactivated;
    }

    public Patient(String patientID) {
        this.patientID = patientID;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public List<Tooth> getTeeth() {
        return teeth;
    }

    public void setTeeth(List<Tooth> teeth) {
        this.teeth = teeth;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCardboardDate() {
        return cardboardDate;
    }

    public void setCardboardDate(Date cartboardDate) {
        this.cardboardDate = cartboardDate;
    }

    public boolean isDeactivated() {
        return deactivated;
    }

    public void setDeactivated(boolean deactivated) {
        this.deactivated = deactivated;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }

}
