package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.SideIntervention;
import com.mikomaric.dentalassistant.domain.dto.SideInterventionDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:34+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class SideInterventionMapperImpl implements SideInterventionMapper {

    private final ToothSideStateMapper toothSideStateMapper = Mappers.getMapper( ToothSideStateMapper.class );
    private final InterventionMapper interventionMapper = Mappers.getMapper( InterventionMapper.class );

    @Override
    public SideIntervention sideInterventionDtoToSideIntervention(SideInterventionDto dto) {
        if ( dto == null ) {
            return null;
        }

        SideIntervention sideIntervention = new SideIntervention();

        sideIntervention.setState( toothSideStateMapper.toothSideStateDtoToToothSideState( dto.getToothSideState() ) );
        if ( dto.getItemID() != null ) {
            sideIntervention.setItemID( String.valueOf( dto.getItemID() ) );
        }
        sideIntervention.setIntervention( interventionMapper.interventionDtoToIntervention( dto.getIntervention() ) );
        sideIntervention.setNote( dto.getNote() );

        return sideIntervention;
    }

    @Override
    public List<SideIntervention> sideInterventionDtoToSideIntervention(List<SideInterventionDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<SideIntervention> list = new ArrayList<SideIntervention>( dto.size() );
        for ( SideInterventionDto sideInterventionDto : dto ) {
            list.add( sideInterventionDtoToSideIntervention( sideInterventionDto ) );
        }

        return list;
    }

    @Override
    public SideInterventionDto sideInterventionDtoToSideInterventionDto(SideIntervention sideIntervention) {
        if ( sideIntervention == null ) {
            return null;
        }

        SideInterventionDto sideInterventionDto = new SideInterventionDto();

        sideInterventionDto.setToothSideState( toothSideStateMapper.toothSideStateToToothSideStateDto( sideIntervention.getState() ) );
        sideInterventionDto.setNote( sideIntervention.getNote() );
        if ( sideIntervention.getItemID() != null ) {
            sideInterventionDto.setItemID( Long.parseLong( sideIntervention.getItemID() ) );
        }
        sideInterventionDto.setIntervention( interventionMapper.interventionToInterventionDto( sideIntervention.getIntervention() ) );

        return sideInterventionDto;
    }

    @Override
    public List<SideInterventionDto> sideInterventionDtoToSideInterventionDto(List<SideIntervention> sideIntervention) {
        if ( sideIntervention == null ) {
            return null;
        }

        List<SideInterventionDto> list = new ArrayList<SideInterventionDto>( sideIntervention.size() );
        for ( SideIntervention sideIntervention1 : sideIntervention ) {
            list.add( sideInterventionDtoToSideInterventionDto( sideIntervention1 ) );
        }

        return list;
    }
}
