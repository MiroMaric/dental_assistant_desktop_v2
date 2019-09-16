package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.ToothSideLabel;
import com.mikomaric.dentalassistant.domain.dto.ToothSideLabelDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:34+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class ToothSideLabelMapperImpl implements ToothSideLabelMapper {

    @Override
    public ToothSideLabel toothSideLabelDtoToToothSideLabel(ToothSideLabelDto dto) {
        if ( dto == null ) {
            return null;
        }

        ToothSideLabel toothSideLabel = new ToothSideLabel();

        if ( dto.getToothSideLabelID() != null ) {
            toothSideLabel.setToothSideLabelID( String.valueOf( dto.getToothSideLabelID() ) );
        }
        toothSideLabel.setName( dto.getName() );
        toothSideLabel.setDescription( dto.getDescription() );

        return toothSideLabel;
    }

    @Override
    public List<ToothSideLabel> toothSideLabelsDtoToToothSideLabels(List<ToothSideLabelDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<ToothSideLabel> list = new ArrayList<ToothSideLabel>( dto.size() );
        for ( ToothSideLabelDto toothSideLabelDto : dto ) {
            list.add( toothSideLabelDtoToToothSideLabel( toothSideLabelDto ) );
        }

        return list;
    }

    @Override
    public ToothSideLabelDto toothSideLabelToToothSideLabelDto(ToothSideLabel toothSideLabel) {
        if ( toothSideLabel == null ) {
            return null;
        }

        ToothSideLabelDto toothSideLabelDto = new ToothSideLabelDto();

        if ( toothSideLabel.getToothSideLabelID() != null ) {
            toothSideLabelDto.setToothSideLabelID( Long.parseLong( toothSideLabel.getToothSideLabelID() ) );
        }
        toothSideLabelDto.setName( toothSideLabel.getName() );
        toothSideLabelDto.setDescription( toothSideLabel.getDescription() );

        return toothSideLabelDto;
    }
}
