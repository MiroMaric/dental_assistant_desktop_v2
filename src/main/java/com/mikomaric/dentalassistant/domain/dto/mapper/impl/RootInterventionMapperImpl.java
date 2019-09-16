package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.RootIntervention;
import com.mikomaric.dentalassistant.domain.dto.RootInterventionDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:35+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class RootInterventionMapperImpl implements RootInterventionMapper {

    private final ToothRootStateMapper toothRootStateMapper = Mappers.getMapper( ToothRootStateMapper.class );
    private final InterventionMapper interventionMapper = Mappers.getMapper( InterventionMapper.class );

    @Override
    public RootIntervention rootInterventionDtoToRootIntervention(RootInterventionDto dto) {
        if ( dto == null ) {
            return null;
        }

        RootIntervention rootIntervention = new RootIntervention();

        if ( dto.getItemID() != null ) {
            rootIntervention.setItemID( String.valueOf( dto.getItemID() ) );
        }
        rootIntervention.setIntervention( interventionMapper.interventionDtoToIntervention( dto.getIntervention() ) );
        rootIntervention.setNote( dto.getNote() );
        rootIntervention.setToothRootState( toothRootStateMapper.toothRootStateDtoToToothRootState( dto.getToothRootState() ) );

        return rootIntervention;
    }

    @Override
    public List<RootIntervention> rootInterventionDtoToRootIntervention(List<RootInterventionDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<RootIntervention> list = new ArrayList<RootIntervention>( dto.size() );
        for ( RootInterventionDto rootInterventionDto : dto ) {
            list.add( rootInterventionDtoToRootIntervention( rootInterventionDto ) );
        }

        return list;
    }

    @Override
    public RootInterventionDto rootInterventionToRootInterventionDto(RootIntervention rootIntervention) {
        if ( rootIntervention == null ) {
            return null;
        }

        RootInterventionDto rootInterventionDto = new RootInterventionDto();

        rootInterventionDto.setNote( rootIntervention.getNote() );
        if ( rootIntervention.getItemID() != null ) {
            rootInterventionDto.setItemID( Long.parseLong( rootIntervention.getItemID() ) );
        }
        rootInterventionDto.setIntervention( interventionMapper.interventionToInterventionDto( rootIntervention.getIntervention() ) );
        rootInterventionDto.setToothRootState( toothRootStateMapper.toothRootStateToToothRootStateDto( rootIntervention.getToothRootState() ) );

        return rootInterventionDto;
    }

    @Override
    public List<RootInterventionDto> rootInterventionToRootInterventionDto(List<RootIntervention> rootIntervention) {
        if ( rootIntervention == null ) {
            return null;
        }

        List<RootInterventionDto> list = new ArrayList<RootInterventionDto>( rootIntervention.size() );
        for ( RootIntervention rootIntervention1 : rootIntervention ) {
            list.add( rootInterventionToRootInterventionDto( rootIntervention1 ) );
        }

        return list;
    }
}
