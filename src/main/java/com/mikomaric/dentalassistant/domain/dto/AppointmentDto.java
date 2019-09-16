package com.mikomaric.dentalassistant.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.Objects;

public class AppointmentDto {

    private Long appointmentID;
    private UserDto user;
    private PatientDto patient;
    private Date startTime;
    private Date endTime;
    private String description;

    public AppointmentDto() {
    }

    public AppointmentDto(Long appointmentID, UserDto user, PatientDto patient, Date startTime, Date endTime, String description) {
        this.appointmentID = appointmentID;
        this.user = user;
        this.patient = patient;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public Long getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Long appointmentID) {
        this.appointmentID = appointmentID;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public PatientDto getPatient() {
        return patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.appointmentID);
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
        final AppointmentDto other = (AppointmentDto) obj;
        if (!Objects.equals(this.appointmentID, other.appointmentID)) {
            return false;
        }
        return true;
    }
}
