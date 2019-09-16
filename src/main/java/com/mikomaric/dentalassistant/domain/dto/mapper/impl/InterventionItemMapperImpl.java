package com.mikomaric.dentalassistant.domain.dto.mapper.impl;

import com.mikomaric.dentalassistant.domain.dto.mapper.*;
import com.mikomaric.dentalassistant.domain.InterventionItem;
import com.mikomaric.dentalassistant.domain.dto.InterventionItemDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-25T20:50:35+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_101 (Oracle Corporation)"
)
public class InterventionItemMapperImpl implements InterventionItemMapper {

    @Override
    public List<InterventionItem> interventionItemDtoToInterventionItem(List<InterventionItemDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<InterventionItem> list = new ArrayList<InterventionItem>( dto.size() );
        for ( InterventionItemDto interventionItemDto : dto ) {
            list.add( interventionItemDtoToInterventionItem( interventionItemDto ) );
        }

        return list;
    }

    @Override
    public List<InterventionItemDto> interventionItemToInterventionItemDto(List<InterventionItem> item) {
        if ( item == null ) {
            return null;
        }

        List<InterventionItemDto> list = new ArrayList<InterventionItemDto>( item.size() );
        for ( InterventionItem interventionItem : item ) {
            list.add( interventionItemToInterventionItemDto( interventionItem ) );
        }

        return list;
    }
}
