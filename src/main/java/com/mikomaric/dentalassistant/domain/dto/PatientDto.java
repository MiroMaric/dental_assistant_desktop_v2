package com.mikomaric.dentalassistant.domain.dto;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PatientDto {
    private Long patientID;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String phone;
    private Date birthDate;
    private Date cardboardDate;
    private boolean deactivated;
    private List<ToothDto> teeth;

    public PatientDto() {
    }

    public PatientDto(Long patientID, String firstname, String lastname, String email, String address, String phone, Date birthDate, Date cardboardDate, boolean deactivated, List<ToothDto> teeth) {
        this.patientID = patientID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
        this.cardboardDate = cardboardDate;
        this.deactivated = deactivated;
        this.teeth = teeth;
    }

    public Long getPatientID() {
        return patientID;
    }

    public void setPatientID(Long patientID) {
        this.patientID = patientID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCardboardDate() {
        return cardboardDate;
    }

    public void setCardboardDate(Date cardboardDate) {
        this.cardboardDate = cardboardDate;
    }

    public boolean isDeactivated() {
        return deactivated;
    }

    public void setDeactivated(boolean deactivated) {
        this.deactivated = deactivated;
    }

    public List<ToothDto> getTeeth() {
        return teeth;
    }

    public void setTeeth(List<ToothDto> teeth) {
        this.teeth = teeth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.patientID);
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
        final PatientDto other = (PatientDto) obj;
        if (!Objects.equals(this.patientID, other.patientID)) {
            return false;
        }
        return true;
    }
    
}
