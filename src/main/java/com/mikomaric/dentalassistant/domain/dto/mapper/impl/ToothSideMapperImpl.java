package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.ToothSide;
import com.mikomaric.dentalassistant.domain.dto.ToothSideDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:35+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class ToothSideMapperImpl implements ToothSideMapper {

    private final ToothSideLabelMapper toothSideLabelMapper = Mappers.getMapper( ToothSideLabelMapper.class );
    private final SideInterventionMapper sideInterventionMapper = Mappers.getMapper( SideInterventionMapper.class );

    @Override
    public ToothSide toothSideDtoToToothSide(ToothSideDto dto) {
        if ( dto == null ) {
            return null;
        }

        ToothSide toothSide = new ToothSide();

        toothSide.setLabel( toothSideLabelMapper.toothSideLabelDtoToToothSideLabel( dto.getSideLabel() ) );
        if ( dto.getToothSideID() != null ) {
            toothSide.setToothSideID( String.valueOf( dto.getToothSideID() ) );
        }
        toothSide.setSideInterventions( sideInterventionMapper.sideInterventionDtoToSideIntervention( dto.getSideInterventions() ) );

        return toothSide;
    }

    @Override
    public List<ToothSide> toothSideDtoToToothSide(List<ToothSideDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<ToothSide> list = new ArrayList<ToothSide>( dto.size() );
        for ( ToothSideDto toothSideDto : dto ) {
            list.add( toothSideDtoToToothSide( toothSideDto ) );
        }

        return list;
    }

    @Override
    public ToothSideDto toothSideToToothSideDto(ToothSide toothSide) {
        if ( toothSide == null ) {
            return null;
        }

        ToothSideDto toothSideDto = new ToothSideDto();

        toothSideDto.setSideLabel( toothSideLabelMapper.toothSideLabelToToothSideLabelDto( toothSide.getLabel() ) );
        if ( toothSide.getToothSideID() != null ) {
            toothSideDto.setToothSideID( Long.parseLong( toothSide.getToothSideID() ) );
        }
        toothSideDto.setSideInterventions( sideInterventionMapper.sideInterventionDtoToSideInterventionDto( toothSide.getSideInterventions() ) );

        return toothSideDto;
    }

    @Override
    public List<ToothSideDto> toothSideToToothSideDto(List<ToothSide> toothSides) {
        if ( toothSides == null ) {
            return null;
        }

        List<ToothSideDto> list = new ArrayList<ToothSideDto>( toothSides.size() );
        for ( ToothSide toothSide : toothSides ) {
            list.add( toothSideToToothSideDto( toothSide ) );
        }

        return list;
    }
}
