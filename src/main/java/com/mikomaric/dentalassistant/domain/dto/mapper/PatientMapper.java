package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.Patient;
import com.mikomaric.dentalassistant.domain.dto.PatientDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {ToothMapper.class})
public interface PatientMapper {
    
    Patient patientDtoToPatient(PatientDto dto);
    List<Patient> patientDtoToPatient(List<PatientDto> dtos);
    @Mapping(target = "patientID",ignore = true)
    PatientDto patientToPatientDto(Patient patient);
    
    
}
