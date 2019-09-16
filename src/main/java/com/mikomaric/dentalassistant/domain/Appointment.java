package com.mikomaric.dentalassistant.domain;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.UUID;

public class Appointment {

    private String appointmentID;
    private User user;
    private Patient patient;
    private GregorianCalendar startTime;
    private GregorianCalendar endTime;
    private String description;

    public Appointment() {
    }

    public Appointment(String appointmentID, Patient patient, User user, GregorianCalendar startTime, GregorianCalendar endTime, String description) {
        this.appointmentID = appointmentID;
        this.user = user;
        this.patient = patient;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public Appointment(Patient patient, User user, GregorianCalendar startTime, GregorianCalendar endTime, String description) {
        this.appointmentID = UUID.randomUUID().toString();
        this.user = user;
        this.patient = patient;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public GregorianCalendar getStartTime() {
        return startTime;
    }

    public void setStartTime(GregorianCalendar startTime) {
        this.startTime = startTime;
    }

    public GregorianCalendar getEndTime() {
        return endTime;
    }

    public void setEndTime(GregorianCalendar endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getStrDuration() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        return sdf.format(getStartTime().getTime()) + " - " + sdf.format(getEndTime().getTime());
    }

}
