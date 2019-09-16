package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.ToothRoot;
import com.mikomaric.dentalassistant.domain.dto.ToothRootDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:35+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class ToothRootMapperImpl implements ToothRootMapper {

    private final ToothRootLabelMapper toothRootLabelMapper = Mappers.getMapper( ToothRootLabelMapper.class );
    private final RootInterventionMapper rootInterventionMapper = Mappers.getMapper( RootInterventionMapper.class );

    @Override
    public ToothRoot toothRootDtoToToothRoot(ToothRootDto dto) {
        if ( dto == null ) {
            return null;
        }

        ToothRoot toothRoot = new ToothRoot();

        toothRoot.setLabel( toothRootLabelMapper.toothRootLabelDtoToToothRootLabel( dto.getRootLabel() ) );
        if ( dto.getToothRootID() != null ) {
            toothRoot.setToothRootID( String.valueOf( dto.getToothRootID() ) );
        }
        toothRoot.setRootInterventions( rootInterventionMapper.rootInterventionDtoToRootIntervention( dto.getRootInterventions() ) );

        return toothRoot;
    }

    @Override
    public List<ToothRoot> toothRootDtoToToothRoot(List<ToothRootDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ToothRoot> list = new ArrayList<ToothRoot>( dtos.size() );
        for ( ToothRootDto toothRootDto : dtos ) {
            list.add( toothRootDtoToToothRoot( toothRootDto ) );
        }

        return list;
    }

    @Override
    public ToothRootDto toothRootToToothRootDto(ToothRoot toothRoot) {
        if ( toothRoot == null ) {
            return null;
        }

        ToothRootDto toothRootDto = new ToothRootDto();

        toothRootDto.setRootLabel( toothRootLabelMapper.toothRootLabelToToothRootLabelDto( toothRoot.getLabel() ) );
        if ( toothRoot.getToothRootID() != null ) {
            toothRootDto.setToothRootID( Long.parseLong( toothRoot.getToothRootID() ) );
        }
        toothRootDto.setRootInterventions( rootInterventionMapper.rootInterventionToRootInterventionDto( toothRoot.getRootInterventions() ) );

        return toothRootDto;
    }

    @Override
    public List<ToothRootDto> toothRootToToothRootDto(List<ToothRoot> toothRoot) {
        if ( toothRoot == null ) {
            return null;
        }

        List<ToothRootDto> list = new ArrayList<ToothRootDto>( toothRoot.size() );
        for ( ToothRoot toothRoot1 : toothRoot ) {
            list.add( toothRootToToothRootDto( toothRoot1 ) );
        }

        return list;
    }
}
