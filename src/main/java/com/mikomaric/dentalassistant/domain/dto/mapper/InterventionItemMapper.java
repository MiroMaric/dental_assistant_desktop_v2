package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.InterventionItem;
import com.mikomaric.dentalassistant.domain.RootIntervention;
import com.mikomaric.dentalassistant.domain.SideIntervention;
import com.mikomaric.dentalassistant.domain.dto.InterventionItemDto;
import com.mikomaric.dentalassistant.domain.dto.RootInterventionDto;
import com.mikomaric.dentalassistant.domain.dto.SideInterventionDto;
import com.mikomaric.dentalassistant.domain.dto.ToothInterventionDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = InterventionMapper.class)
public interface InterventionItemMapper {
    
    //Interfejs polja?!
    
    SideInterventionMapper sideInterventionMapper  = Mappers.getMapper( SideInterventionMapper.class );
    RootInterventionMapper rootInterventionMapper  = Mappers.getMapper( RootInterventionMapper.class );
    ToothInterventionMapper toothInterventionMapper  = Mappers.getMapper( ToothInterventionMapper.class );
   
    default InterventionItem interventionItemDtoToInterventionItem(InterventionItemDto dto){
        if(dto==null)
            return null;
        if(dto instanceof SideInterventionDto){
            return sideInterventionMapper.sideInterventionDtoToSideIntervention((SideInterventionDto)dto);
        }else if(dto instanceof RootInterventionDto){
            return rootInterventionMapper.rootInterventionDtoToRootIntervention((RootInterventionDto)dto);
        }else{
            return toothInterventionMapper.toothInterventiondDtoToToothIntervention((ToothInterventionDto)dto);
        }
    }
    
    default InterventionItemDto interventionItemToInterventionItemDto(InterventionItem item){
        if(item==null)
            return null;
        if(item instanceof RootIntervention){
            return new RootInterventionDto();
        }else if(item instanceof SideIntervention){
            return new SideInterventionDto();
        }else{
            return new ToothInterventionDto();
        }
    }
//    InterventionItem interventionItemDtoToInterventionItem(InterventionItemDto dto);
//    InterventionItemDto interventionItemToInterventionItemDto(InterventionItem item);
    List<InterventionItem> interventionItemDtoToInterventionItem(List<InterventionItemDto> dto);
    List<InterventionItemDto> interventionItemToInterventionItemDto(List<InterventionItem> item);
    
}
