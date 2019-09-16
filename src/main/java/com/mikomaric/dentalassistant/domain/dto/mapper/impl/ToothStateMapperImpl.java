package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.ToothState;
import com.mikomaric.dentalassistant.domain.dto.ToothStateDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:35+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class ToothStateMapperImpl implements ToothStateMapper {

    @Override
    public ToothState toothStateDtoToToothState(ToothStateDto dto) {
        if ( dto == null ) {
            return null;
        }

        ToothState toothState = new ToothState();

        if ( dto.getToothStateID() != null ) {
            toothState.setToothStateID( dto.getToothStateID().intValue() );
        }
        toothState.setName( dto.getName() );
        toothState.setDescription( dto.getDescription() );
        if ( dto.getColor() != null ) {
            toothState.setColor( Integer.parseInt( dto.getColor() ) );
        }

        return toothState;
    }

    @Override
    public List<ToothState> toothStatesDtoToToothStates(List<ToothStateDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ToothState> list = new ArrayList<ToothState>( dtos.size() );
        for ( ToothStateDto toothStateDto : dtos ) {
            list.add( toothStateDtoToToothState( toothStateDto ) );
        }

        return list;
    }

    @Override
    public ToothStateDto toothStateToToothStateDto(ToothState toothState) {
        if ( toothState == null ) {
            return null;
        }

        ToothStateDto toothStateDto = new ToothStateDto();

        toothStateDto.setToothStateID( (long) toothState.getToothStateID() );
        toothStateDto.setName( toothState.getName() );
        toothStateDto.setColor( String.valueOf( toothState.getColor() ) );
        toothStateDto.setDescription( toothState.getDescription() );

        return toothStateDto;
    }
}
