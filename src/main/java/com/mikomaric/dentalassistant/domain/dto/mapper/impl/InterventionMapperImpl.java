package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.Intervention;
import com.mikomaric.dentalassistant.domain.dto.InterventionDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:34+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class InterventionMapperImpl implements InterventionMapper {

    private final InterventionItemMapper interventionItemMapper = Mappers.getMapper( InterventionItemMapper.class );
    private final UserMapper userMapper = Mappers.getMapper( UserMapper.class );

    @Override
    public Intervention interventionDtoToIntervention(InterventionDto dto) {
        if ( dto == null ) {
            return null;
        }

        Intervention intervention = new Intervention();

        if ( dto.getInterventionID() != null ) {
            intervention.setInterventionID( String.valueOf( dto.getInterventionID() ) );
        }
        intervention.setDate( dto.getDate() );
        intervention.setNote( dto.getNote() );
        intervention.setItems( interventionItemMapper.interventionItemDtoToInterventionItem( dto.getItems() ) );
        intervention.setUser( userMapper.UserDtoToUser( dto.getUser() ) );

        return intervention;
    }

    @Override
    public List<Intervention> interventionDtoToIntervention(List<InterventionDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Intervention> list = new ArrayList<Intervention>( dtos.size() );
        for ( InterventionDto interventionDto : dtos ) {
            list.add( interventionDtoToIntervention( interventionDto ) );
        }

        return list;
    }

    @Override
    public InterventionDto interventionToInterventionDto(Intervention intervention) {
        if ( intervention == null ) {
            return null;
        }

        InterventionDto interventionDto = new InterventionDto();

        if ( intervention.getInterventionID() != null ) {
            interventionDto.setInterventionID( Long.parseLong( intervention.getInterventionID() ) );
        }
        interventionDto.setDate( intervention.getDate() );
        interventionDto.setUser( userMapper.UserToUserDto( intervention.getUser() ) );
        interventionDto.setItems( interventionItemMapper.interventionItemToInterventionItemDto( intervention.getItems() ) );
        interventionDto.setNote( intervention.getNote() );

        return interventionDto;
    }

    @Override
    public List<InterventionDto> interventionToInterventionDto(List<Intervention> interventions) {
        if ( interventions == null ) {
            return null;
        }

        List<InterventionDto> list = new ArrayList<InterventionDto>( interventions.size() );
        for ( Intervention intervention : interventions ) {
            list.add( interventionToInterventionDto( intervention ) );
        }

        return list;
    }
}
