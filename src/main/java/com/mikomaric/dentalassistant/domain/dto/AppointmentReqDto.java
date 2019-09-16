package com.mikomaric.dentalassistant.domain.dto;

import java.util.Date;

public class AppointmentReqDto {
    
    private String username;
    private Long patientID;
    private Date startTime;
    private Date endTime;
    private String description;

    public AppointmentReqDto() {
    }

    public AppointmentReqDto(String username, Long patientID, Date startTime, Date endTime, String description) {
        this.username = username;
        this.patientID = patientID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getPatientID() {
        return patientID;
    }

    public void setPatientID(Long patientID) {
        this.patientID = patientID;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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
}
