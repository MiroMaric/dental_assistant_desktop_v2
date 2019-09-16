package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.Appointment;
import com.mikomaric.dentalassistant.domain.dto.AppointmentDto;
import com.mikomaric.dentalassistant.domain.dto.AppointmentReqDto;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses={PatientMapper.class,UserMapper.class})
public interface AppointmentMapper {
    Appointment appointmentDtoToAppointment(AppointmentDto dto);
    List<Appointment> appointmentDtoToAppointment(List<AppointmentDto> dto);
    AppointmentDto appointmentToAppointmentDto(Appointment appointment);
    List<AppointmentDto> appointmentToAppointmentDto(List<Appointment> appointment);
    
    @Mapping(target = "username",source = "user.username")
    @Mapping(target = "patientID",source = "patient.patientID")
    AppointmentReqDto AppointmentToAppointmentReqDto(Appointment appointment);
    
    default GregorianCalendar dateToGc(Date date){
        if(date==null)
            return null;
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        return gc;
    }
    
    default Date gcToDate(GregorianCalendar gc){
        if(gc==null){
            return null;
        }
        return new Date(gc.getTimeInMillis());
    }
    
}
