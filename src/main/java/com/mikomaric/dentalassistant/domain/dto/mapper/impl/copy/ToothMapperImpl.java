package com.mikomaric.dentalassistant.domain.dto.mapper.impl.copy;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.Tooth;
import com.mikomaric.dentalassistant.domain.dto.ToothDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-21T17:32:15+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class ToothMapperImpl implements ToothMapper {

    private final ToothLabelMapper toothLabelMapper = Mappers.getMapper( ToothLabelMapper.class );
    private final ToothSideMapper toothSideMapper = Mappers.getMapper( ToothSideMapper.class );
    private final ToothRootMapper toothRootMapper = Mappers.getMapper( ToothRootMapper.class );

    @Override
    public Tooth toothDtoToTooth(ToothDto dto) {
        if ( dto == null ) {
            return null;
        }

        Tooth tooth = new Tooth();

        tooth.setSides( toothSideMapper.toothSideDtoToToothSide( dto.getToothSides() ) );
        tooth.setLabel( toothLabelMapper.toothLabelDtoToToothLabel( dto.getToothLabel() ) );
        tooth.setRoots( toothRootMapper.toothRootDtoToToothRoot( dto.getToothRoots() ) );
        if ( dto.getToothID() != null ) {
            tooth.setToothID( String.valueOf( dto.getToothID() ) );
        }

        return tooth;
    }

    @Override
    public List<Tooth> toothDtoToTooth(List<ToothDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Tooth> list = new ArrayList<Tooth>( dtos.size() );
        for ( ToothDto toothDto : dtos ) {
            list.add( toothDtoToTooth( toothDto ) );
        }

        return list;
    }

    @Override
    public ToothDto toothToToothDto(Tooth tooth) {
        if ( tooth == null ) {
            return null;
        }

        ToothDto toothDto = new ToothDto();

        toothDto.setToothLabel( toothLabelMapper.toothLabelToToothLabelDto( tooth.getLabel() ) );
        toothDto.setToothRoots( toothRootMapper.toothRootToToothRootDto( tooth.getRoots() ) );
        toothDto.setToothSides( toothSideMapper.toothSideToToothSideDto( tooth.getSides() ) );
        if ( tooth.getToothID() != null ) {
            toothDto.setToothID( Long.parseLong( tooth.getToothID() ) );
        }

        return toothDto;
    }

    @Override
    public List<ToothDto> toothToToothDto(List<Tooth> teeth) {
        if ( teeth == null ) {
            return null;
        }

        List<ToothDto> list = new ArrayList<ToothDto>( teeth.size() );
        for ( Tooth tooth : teeth ) {
            list.add( toothToToothDto( tooth ) );
        }

        return list;
    }
}
