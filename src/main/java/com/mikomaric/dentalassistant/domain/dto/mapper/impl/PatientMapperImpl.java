package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.Patient;
import com.mikomaric.dentalassistant.domain.RootIntervention;
import com.mikomaric.dentalassistant.domain.SideIntervention;
import com.mikomaric.dentalassistant.domain.Tooth;
import com.mikomaric.dentalassistant.domain.ToothIntervention;
import com.mikomaric.dentalassistant.domain.ToothRoot;
import com.mikomaric.dentalassistant.domain.ToothSide;
import com.mikomaric.dentalassistant.domain.dto.PatientDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2019-08-25T22:15:39+0200",
        comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class PatientMapperImpl implements PatientMapper {

    private final ToothMapper toothMapper = Mappers.getMapper(ToothMapper.class);

    @Override
    public Patient patientDtoToPatient(PatientDto dto) {
        if (dto == null) {
            return null;
        }

        Patient patient = new Patient();

        patient.setFirstname(dto.getFirstname());
        patient.setLastname(dto.getLastname());
        patient.setEmail(dto.getEmail());
        patient.setAddress(dto.getAddress());
        patient.setPhone(dto.getPhone());
        patient.setTeeth(toothMapper.toothDtoToTooth(dto.getTeeth()));
        patient.setBirthDate(dto.getBirthDate());
        patient.setCardboardDate(dto.getCardboardDate());
        patient.setDeactivated(dto.isDeactivated());
        if (dto.getPatientID() != null) {
            patient.setPatientID(String.valueOf(dto.getPatientID()));
        }
        if (patient.getTeeth()!=null && !patient.getTeeth().isEmpty()){
            ConnectBidirectionalRelationship(patient);
        }
        return patient;
    }

    @Override
    public List<Patient> patientDtoToPatient(List<PatientDto> dtos) {
        if (dtos == null) {
            return null;
        }

        List<Patient> list = new ArrayList<Patient>(dtos.size());
        for (PatientDto patientDto : dtos) {
            list.add(patientDtoToPatient(patientDto));
        }

        return list;
    }

    @Override
    public PatientDto patientToPatientDto(Patient patient) {
        if (patient == null) {
            return null;
        }

        PatientDto patientDto = new PatientDto();

        patientDto.setFirstname(patient.getFirstname());
        patientDto.setLastname(patient.getLastname());
        patientDto.setEmail(patient.getEmail());
        patientDto.setAddress(patient.getAddress());
        patientDto.setPhone(patient.getPhone());
        patientDto.setBirthDate(patient.getBirthDate());
        patientDto.setCardboardDate(patient.getCardboardDate());
        patientDto.setDeactivated(patient.isDeactivated());
        patientDto.setTeeth(toothMapper.toothToToothDto(patient.getTeeth()));

        return patientDto;
    }

    private void ConnectBidirectionalRelationship(Patient patient) {
        for (Tooth tooth : patient.getTeeth()) {
            tooth.setPatient(patient);
            for (ToothIntervention ti : tooth.getToothInterventions()) {
                ti.setTooth(tooth);
            }
            for (ToothSide side : tooth.getSides()) {
                side.setTooth(tooth);
                for (SideIntervention si : side.getSideInterventions()) {
                    si.setToothSide(side);
                }
            }
            for (ToothRoot tr : tooth.getRoots()) {
                tr.setTooth(tooth);
                for (RootIntervention ri : tr.getRootInterventions()) {
                    ri.setToothRoot(tr);
                }
            }
        }
    }
}
