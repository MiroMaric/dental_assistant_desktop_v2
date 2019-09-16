package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.ToothRootState;
import com.mikomaric.dentalassistant.domain.dto.ToothRootStateDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:36+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class ToothRootStateMapperImpl implements ToothRootStateMapper {

    @Override
    public ToothRootState toothRootStateDtoToToothRootState(ToothRootStateDto dto) {
        if ( dto == null ) {
            return null;
        }

        ToothRootState toothRootState = new ToothRootState();

        if ( dto.getToothRootStateID() != null ) {
            toothRootState.setToothRootStateID( dto.getToothRootStateID().intValue() );
        }
        toothRootState.setName( dto.getName() );
        toothRootState.setDescription( dto.getDescription() );
        if ( dto.getColor() != null ) {
            toothRootState.setColor( Integer.parseInt( dto.getColor() ) );
        }

        return toothRootState;
    }

    @Override
    public List<ToothRootState> toothRootStateDtoToToothRootState(List<ToothRootStateDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<ToothRootState> list = new ArrayList<ToothRootState>( dto.size() );
        for ( ToothRootStateDto toothRootStateDto : dto ) {
            list.add( toothRootStateDtoToToothRootState( toothRootStateDto ) );
        }

        return list;
    }

    @Override
    public ToothRootStateDto toothRootStateToToothRootStateDto(ToothRootState toothRootState) {
        if ( toothRootState == null ) {
            return null;
        }

        ToothRootStateDto toothRootStateDto = new ToothRootStateDto();

        toothRootStateDto.setToothRootStateID( (long) toothRootState.getToothRootStateID() );
        toothRootStateDto.setName( toothRootState.getName() );
        toothRootStateDto.setColor( String.valueOf( toothRootState.getColor() ) );
        toothRootStateDto.setDescription( toothRootState.getDescription() );

        return toothRootStateDto;
    }
}
