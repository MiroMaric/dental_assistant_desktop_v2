package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.ToothIntervention;
import com.mikomaric.dentalassistant.domain.dto.ToothInterventionDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:35+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class ToothInterventionMapperImpl implements ToothInterventionMapper {

    private final ToothStateMapper toothStateMapper = Mappers.getMapper( ToothStateMapper.class );
    private final InterventionMapper interventionMapper = Mappers.getMapper( InterventionMapper.class );

    @Override
    public ToothIntervention toothInterventiondDtoToToothIntervention(ToothInterventionDto dto) {
        if ( dto == null ) {
            return null;
        }

        ToothIntervention toothIntervention = new ToothIntervention();

        toothIntervention.setState( toothStateMapper.toothStateDtoToToothState( dto.getToothState() ) );
        if ( dto.getItemID() != null ) {
            toothIntervention.setItemID( String.valueOf( dto.getItemID() ) );
        }
        toothIntervention.setIntervention( interventionMapper.interventionDtoToIntervention( dto.getIntervention() ) );
        toothIntervention.setNote( dto.getNote() );

        return toothIntervention;
    }

    @Override
    public List<ToothIntervention> toothInterventiondDtoToToothIntervention(List<ToothInterventionDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<ToothIntervention> list = new ArrayList<ToothIntervention>( dto.size() );
        for ( ToothInterventionDto toothInterventionDto : dto ) {
            list.add( toothInterventiondDtoToToothIntervention( toothInterventionDto ) );
        }

        return list;
    }

    @Override
    public ToothInterventionDto toothInterventionToToothInterventionDto(ToothIntervention toothIntervention) {
        if ( toothIntervention == null ) {
            return null;
        }

        ToothInterventionDto toothInterventionDto = new ToothInterventionDto();

        toothInterventionDto.setToothState( toothStateMapper.toothStateToToothStateDto( toothIntervention.getState() ) );
        toothInterventionDto.setNote( toothIntervention.getNote() );
        if ( toothIntervention.getItemID() != null ) {
            toothInterventionDto.setItemID( Long.parseLong( toothIntervention.getItemID() ) );
        }
        toothInterventionDto.setIntervention( interventionMapper.interventionToInterventionDto( toothIntervention.getIntervention() ) );

        return toothInterventionDto;
    }

    @Override
    public List<ToothInterventionDto> toothInterventionToToothInterventionDto(List<ToothIntervention> toothIntervention) {
        if ( toothIntervention == null ) {
            return null;
        }

        List<ToothInterventionDto> list = new ArrayList<ToothInterventionDto>( toothIntervention.size() );
        for ( ToothIntervention toothIntervention1 : toothIntervention ) {
            list.add( toothInterventionToToothInterventionDto( toothIntervention1 ) );
        }

        return list;
    }
}
