package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.ToothSideState;
import com.mikomaric.dentalassistant.domain.dto.ToothSideStateDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:35+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class ToothSideStateMapperImpl implements ToothSideStateMapper {

    @Override
    public ToothSideState toothSideStateDtoToToothSideState(ToothSideStateDto dto) {
        if ( dto == null ) {
            return null;
        }

        ToothSideState toothSideState = new ToothSideState();

        if ( dto.getToothSideStateID() != null ) {
            toothSideState.setToothSideStateID( dto.getToothSideStateID().intValue() );
        }
        toothSideState.setName( dto.getName() );
        toothSideState.setDescription( dto.getDescription() );
        if ( dto.getColor() != null ) {
            toothSideState.setColor( Integer.parseInt( dto.getColor() ) );
        }

        return toothSideState;
    }

    @Override
    public List<ToothSideState> toothSideStatesDtoToToothSideStates(List<ToothSideStateDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ToothSideState> list = new ArrayList<ToothSideState>( dtos.size() );
        for ( ToothSideStateDto toothSideStateDto : dtos ) {
            list.add( toothSideStateDtoToToothSideState( toothSideStateDto ) );
        }

        return list;
    }

    @Override
    public ToothSideStateDto toothSideStateToToothSideStateDto(ToothSideState toothSideState) {
        if ( toothSideState == null ) {
            return null;
        }

        ToothSideStateDto toothSideStateDto = new ToothSideStateDto();

        toothSideStateDto.setToothSideStateID( (long) toothSideState.getToothSideStateID() );
        toothSideStateDto.setName( toothSideState.getName() );
        toothSideStateDto.setColor( String.valueOf( toothSideState.getColor() ) );
        toothSideStateDto.setDescription( toothSideState.getDescription() );

        return toothSideStateDto;
    }
}
