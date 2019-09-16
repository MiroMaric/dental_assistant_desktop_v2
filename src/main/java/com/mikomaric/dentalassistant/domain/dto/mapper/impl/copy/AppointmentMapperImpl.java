package com.mikomaric.dentalassistant.domain.dto.mapper.impl.copy;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.Appointment;
import com.mikomaric.dentalassistant.domain.Patient;
import com.mikomaric.dentalassistant.domain.User;
import com.mikomaric.dentalassistant.domain.dto.AppointmentDto;
import com.mikomaric.dentalassistant.domain.dto.AppointmentReqDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-21T21:57:09+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class AppointmentMapperImpl implements AppointmentMapper {

    private final PatientMapper patientMapper = Mappers.getMapper( PatientMapper.class );
    private final UserMapper userMapper = Mappers.getMapper( UserMapper.class );

    @Override
    public Appointment appointmentDtoToAppointment(AppointmentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Appointment appointment = new Appointment();

        appointment.setUser( userMapper.UserDtoToUser( dto.getUser() ) );
        appointment.setPatient( patientMapper.patientDtoToPatient( dto.getPatient() ) );
        appointment.setStartTime( dateToGc( dto.getStartTime() ) );
        appointment.setEndTime( dateToGc( dto.getEndTime() ) );
        appointment.setDescription( dto.getDescription() );
        if ( dto.getAppointmentID() != null ) {
            appointment.setAppointmentID( String.valueOf( dto.getAppointmentID() ) );
        }

        return appointment;
    }

    @Override
    public List<Appointment> appointmentDtoToAppointment(List<AppointmentDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<Appointment> list = new ArrayList<Appointment>( dto.size() );
        for ( AppointmentDto appointmentDto : dto ) {
            list.add( appointmentDtoToAppointment( appointmentDto ) );
        }

        return list;
    }

    @Override
    public AppointmentDto appointmentToAppointmentDto(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }

        AppointmentDto appointmentDto = new AppointmentDto();

        if ( appointment.getAppointmentID() != null ) {
            appointmentDto.setAppointmentID( Long.parseLong( appointment.getAppointmentID() ) );
        }
        appointmentDto.setUser( userMapper.UserToUserDto( appointment.getUser() ) );
        appointmentDto.setPatient( patientMapper.patientToPatientDto( appointment.getPatient() ) );
        appointmentDto.setEndTime( gcToDate( appointment.getEndTime() ) );
        appointmentDto.setDescription( appointment.getDescription() );
        appointmentDto.setStartTime( gcToDate( appointment.getStartTime() ) );

        return appointmentDto;
    }

    @Override
    public List<AppointmentDto> appointmentToAppointmentDto(List<Appointment> appointment) {
        if ( appointment == null ) {
            return null;
        }

        List<AppointmentDto> list = new ArrayList<AppointmentDto>( appointment.size() );
        for ( Appointment appointment1 : appointment ) {
            list.add( appointmentToAppointmentDto( appointment1 ) );
        }

        return list;
    }

    @Override
    public AppointmentReqDto AppointmentToAppointmentReqDto(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }

        AppointmentReqDto appointmentReqDto = new AppointmentReqDto();

        String patientID = appointmentPatientPatientID( appointment );
        if ( patientID != null ) {
            appointmentReqDto.setPatientID( Long.parseLong( patientID ) );
        }
        appointmentReqDto.setUsername( appointmentUserUsername( appointment ) );
        appointmentReqDto.setStartTime( gcToDate( appointment.getStartTime() ) );
        appointmentReqDto.setEndTime( gcToDate( appointment.getEndTime() ) );
        appointmentReqDto.setDescription( appointment.getDescription() );

        return appointmentReqDto;
    }

    private String appointmentPatientPatientID(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        Patient patient = appointment.getPatient();
        if ( patient == null ) {
            return null;
        }
        String patientID = patient.getPatientID();
        if ( patientID == null ) {
            return null;
        }
        return patientID;
    }

    private String appointmentUserUsername(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        User user = appointment.getUser();
        if ( user == null ) {
            return null;
        }
        String username = user.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }
}
