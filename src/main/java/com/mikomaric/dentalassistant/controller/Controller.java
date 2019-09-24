package com.mikomaric.dentalassistant.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mikomaric.dentalassistant.communication.Communication;
import com.mikomaric.dentalassistant.communication.exception.MyNotAuthorizedException;
import com.mikomaric.dentalassistant.domain.Appointment;
import com.mikomaric.dentalassistant.domain.Patient;
import com.mikomaric.dentalassistant.domain.User;
import com.mikomaric.dentalassistant.domain.Intervention;
import com.mikomaric.dentalassistant.domain.ToothRootState;
import com.mikomaric.dentalassistant.domain.ToothSideLabel;
import com.mikomaric.dentalassistant.domain.ToothSideState;
import com.mikomaric.dentalassistant.domain.ToothState;
import com.mikomaric.dentalassistant.domain.dto.AppointmentDto;
import com.mikomaric.dentalassistant.domain.dto.PatientDto;
import com.mikomaric.dentalassistant.domain.dto.ToothRootStateDto;
import com.mikomaric.dentalassistant.domain.dto.ToothSideLabelDto;
import com.mikomaric.dentalassistant.domain.dto.ToothSideStateDto;
import com.mikomaric.dentalassistant.domain.dto.ToothStateDto;
import com.mikomaric.dentalassistant.domain.dto.mapper.PatientMapper;
import com.mikomaric.dentalassistant.domain.dto.mapper.impl.AppointmentMapperImpl;
import com.mikomaric.dentalassistant.domain.dto.mapper.impl.InterventionMapperImpl;
import com.mikomaric.dentalassistant.domain.dto.mapper.impl.PatientMapperImpl;
import com.mikomaric.dentalassistant.domain.dto.mapper.impl.ToothRootStateMapperImpl;
import com.mikomaric.dentalassistant.domain.dto.mapper.impl.ToothSideLabelMapperImpl;
import com.mikomaric.dentalassistant.domain.dto.mapper.impl.ToothSideStateMapperImpl;
import com.mikomaric.dentalassistant.domain.dto.mapper.impl.ToothStateMapperImpl;
import com.mikomaric.dentalassistant.domain.dto.mapper.impl.UserMapperImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {

    private static Controller instance;

    private Controller() {
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public User logIn(String username, String password) throws MyNotAuthorizedException,Exception {
        System.out.println("Login!");
        Communication.getInstance().setPassword(password);
        Communication.getInstance().setUsername(username);
        JsonNode data = Communication.getInstance().get("users/" + username);
        if (data.isObject()) {
            ObjectMapper mapper = new ObjectMapper();
            User user = mapper.treeToValue(data, User.class);
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new Exception("Greška");
    }

    public List<Appointment> getAllAppointments() throws Exception {
        List<Appointment> appointments = new ArrayList<>();
        JsonNode data = Communication.getInstance().get("appointments");
        if (data.isArray()) {
            ObjectMapper mapper = new ObjectMapper();
            for (JsonNode item : data) {
                AppointmentDto dto = mapper.treeToValue(item, AppointmentDto.class);
                Appointment appointment = new AppointmentMapperImpl().appointmentDtoToAppointment(dto);
                appointments.add(appointment);
            }
        }
        return appointments;
    }

    public List<Patient> getAllPatients() throws Exception {
        List<Patient> patients = new ArrayList<>();
        JsonNode data = Communication.getInstance().get("patients");
        if (data.isArray()) {
            ObjectMapper mapper = new ObjectMapper();
            for (JsonNode item : data) {
                PatientDto dto = mapper.treeToValue(item, PatientDto.class);
                Patient patient = new PatientMapperImpl().patientDtoToPatient(dto);
                patients.add(patient);
            }
        }
        return patients;
    }

    public void deleteAppointment(Appointment appointment) throws Exception {
        Communication.getInstance().delete("appointments/" + appointment.getAppointmentID());
    }

    public Appointment saveAppointment(Appointment appointment) throws Exception {
        JsonNode data = Communication.getInstance().post("appointments", new AppointmentMapperImpl().AppointmentToAppointmentReqDto(appointment));
        ObjectMapper mapper = new ObjectMapper();
        AppointmentDto dto = mapper.treeToValue(data, AppointmentDto.class);
        Appointment retrievedAppointment = new AppointmentMapperImpl().appointmentDtoToAppointment(dto);
        System.out.println(retrievedAppointment.getAppointmentID());
        return retrievedAppointment;
    }

    public void updateAppointment(Appointment appointment) throws Exception {
        Communication.getInstance().put("appointments/" + appointment.getAppointmentID(),
                new AppointmentMapperImpl().AppointmentToAppointmentReqDto(appointment));
    }

    public void updatePatient(Patient patient) throws Exception {
        Communication.getInstance().put("patients/" + patient.getPatientID(),
                new PatientMapperImpl().patientToPatientDto(patient));
    }

    public List<ToothSideState> getAllToothSideStates() throws Exception {
        List<ToothSideState> states = new ArrayList<>();
        JsonNode data = Communication.getInstance().get("toothSideStates");
        if (data.isArray()) {
            ObjectMapper mapper = new ObjectMapper();
            for (JsonNode item : data) {
                ToothSideStateDto dto = mapper.treeToValue(item, ToothSideStateDto.class);
                ToothSideState state = new ToothSideStateMapperImpl().toothSideStateDtoToToothSideState(dto);
                states.add(state);
            }
        }
        return states;
    }

    public List<ToothRootState> getAllToothRootStates() throws Exception {
        List<ToothRootState> states = new ArrayList<>();
        JsonNode data = Communication.getInstance().get("toothRootStates");
        if (data.isArray()) {
            ObjectMapper mapper = new ObjectMapper();
            for (JsonNode item : data) {
                ToothRootStateDto dto = mapper.treeToValue(item, ToothRootStateDto.class);
                ToothRootState state = new ToothRootStateMapperImpl().toothRootStateDtoToToothRootState(dto);
                states.add(state);
            }
        }
        return states;
    }

    public List<ToothState> getAllToothStates() throws Exception {
        List<ToothState> states = new ArrayList<>();
        JsonNode data = Communication.getInstance().get("toothStates");
        if (data.isArray()) {
            ObjectMapper mapper = new ObjectMapper();
            for (JsonNode item : data) {
                ToothStateDto dto = mapper.treeToValue(item, ToothStateDto.class);
                ToothState state = new ToothStateMapperImpl().toothStateDtoToToothState(dto);
                states.add(state);
            }
        }
        return states;
    }

    public List<ToothSideLabel> getToothSideLabels() throws Exception {
        List<ToothSideLabel> labels = new ArrayList<>(5);
        JsonNode data = Communication.getInstance().get("toothSideLabels");
        if (data.isArray()) {
            ObjectMapper mapper = new ObjectMapper();
            for (JsonNode item : data) {
                ToothSideLabelDto dto = mapper.treeToValue(item, ToothSideLabelDto.class);
                ToothSideLabel label = new ToothSideLabelMapperImpl().toothSideLabelDtoToToothSideLabel(dto);
                labels.add(label);
            }
        }
        return labels;
    }

    public void registerNewUser(User user) throws Exception {
        Communication.getInstance().post("users", new UserMapperImpl().UserToUserDto(user));
    }

    public void createCardboard(Patient patient) throws Exception {
        Communication.getInstance().post("patients", new PatientMapperImpl().patientToPatientDto(patient));
    }

    public Patient findCardboard(Patient patient) throws Exception {
        JsonNode data = Communication.getInstance().get("patients/" + patient.getPatientID());
        if (data.isObject()) {
            ObjectMapper mapper = new ObjectMapper();
            PatientDto dto = mapper.treeToValue(data, PatientDto.class);
            return new PatientMapperImpl().patientDtoToPatient(dto);
        }
        throw new Exception("Error message come here!!!");
    }

    public void saveIntervention(Intervention intervention) throws Exception {
        System.out.println(intervention.getUser().getUsername());
        Communication.getInstance().post("interventions", new InterventionMapperImpl().interventionToInterventionDto(intervention));
    }

    public static void main(String[] args) {
        try {
            List<ToothSideLabel> labels = Controller.getInstance().getToothSideLabels();
            for (ToothSideLabel state : labels) {
                System.out.println(state.getToothSideLabelID());
                System.out.println(state.getName());
                System.out.println(state.getDescription());
            }
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
