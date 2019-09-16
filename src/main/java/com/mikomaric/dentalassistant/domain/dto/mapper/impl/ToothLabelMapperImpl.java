package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.ToothLabel;
import com.mikomaric.dentalassistant.domain.dto.ToothLabelDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:35+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class ToothLabelMapperImpl implements ToothLabelMapper {

    @Override
    public ToothLabel toothLabelDtoToToothLabel(ToothLabelDto dto) {
        if ( dto == null ) {
            return null;
        }

        ToothLabel toothLabel = new ToothLabel();

        if ( dto.getToothLabelID() != null ) {
            toothLabel.setToothLabelID( String.valueOf( dto.getToothLabelID() ) );
        }
        toothLabel.setNumber( dto.getNumber() );
        toothLabel.setQuadrant( dto.getQuadrant() );
        toothLabel.setNumOfRoots( dto.getNumOfRoots() );
        toothLabel.setDescription( dto.getDescription() );

        return toothLabel;
    }

    @Override
    public List<ToothLabel> toothLabelsDtoToToothLabels(List<ToothLabelDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ToothLabel> list = new ArrayList<ToothLabel>( dtos.size() );
        for ( ToothLabelDto toothLabelDto : dtos ) {
            list.add( toothLabelDtoToToothLabel( toothLabelDto ) );
        }

        return list;
    }

    @Override
    public ToothLabelDto toothLabelToToothLabelDto(ToothLabel toothLabel) {
        if ( toothLabel == null ) {
            return null;
        }

        ToothLabelDto toothLabelDto = new ToothLabelDto();

        if ( toothLabel.getToothLabelID() != null ) {
            toothLabelDto.setToothLabelID( Long.parseLong( toothLabel.getToothLabelID() ) );
        }
        toothLabelDto.setNumber( toothLabel.getNumber() );
        toothLabelDto.setQuadrant( toothLabel.getQuadrant() );
        toothLabelDto.setNumOfRoots( toothLabel.getNumOfRoots() );
        toothLabelDto.setDescription( toothLabel.getDescription() );

        return toothLabelDto;
    }
}
