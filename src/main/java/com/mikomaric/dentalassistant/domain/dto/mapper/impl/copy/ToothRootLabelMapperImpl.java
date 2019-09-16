package com.mikomaric.dentalassistant.domain.dto.mapper.impl.copy;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.ToothRootLabel;
import com.mikomaric.dentalassistant.domain.dto.ToothRootLabelDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-21T17:32:14+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class ToothRootLabelMapperImpl implements ToothRootLabelMapper {

    @Override
    public ToothRootLabel toothRootLabelDtoToToothRootLabel(ToothRootLabelDto dto) {
        if ( dto == null ) {
            return null;
        }

        ToothRootLabel toothRootLabel = new ToothRootLabel();

        if ( dto.getToothRootLabelID() != null ) {
            toothRootLabel.setToothRootLabelID( String.valueOf( dto.getToothRootLabelID() ) );
        }
        toothRootLabel.setName( dto.getName() );
        toothRootLabel.setDescription( dto.getDescription() );

        return toothRootLabel;
    }

    @Override
    public List<ToothRootLabel> toothRootLabelDtoToToothRootLabel(List<ToothRootLabelDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<ToothRootLabel> list = new ArrayList<ToothRootLabel>( dto.size() );
        for ( ToothRootLabelDto toothRootLabelDto : dto ) {
            list.add( toothRootLabelDtoToToothRootLabel( toothRootLabelDto ) );
        }

        return list;
    }

    @Override
    public ToothRootLabelDto toothRootLabelToToothRootLabelDto(ToothRootLabel toothRootLabel) {
        if ( toothRootLabel == null ) {
            return null;
        }

        ToothRootLabelDto toothRootLabelDto = new ToothRootLabelDto();

        if ( toothRootLabel.getToothRootLabelID() != null ) {
            toothRootLabelDto.setToothRootLabelID( Long.parseLong( toothRootLabel.getToothRootLabelID() ) );
        }
        toothRootLabelDto.setName( toothRootLabel.getName() );
        toothRootLabelDto.setDescription( toothRootLabel.getDescription() );

        return toothRootLabelDto;
    }
}
