package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.SideIntervention;
import com.mikomaric.dentalassistant.domain.dto.SideInterventionDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {ToothSideMapper.class, ToothSideStateMapper.class, InterventionItemMapper.class, InterventionMapper.class})
public interface SideInterventionMapper {

    @Mapping(source = "toothSideState", target = "state")
//    @Mapping(source = "interventionItemID", target = "itemID")
    @Mapping(target = "toothSide", ignore = true)
    SideIntervention sideInterventionDtoToSideIntervention(SideInterventionDto dto);

    List<SideIntervention> sideInterventionDtoToSideIntervention(List<SideInterventionDto> dto);

    @Mapping(source = "state", target = "toothSideState")
//    @Mapping(source = "itemID", target = "interventionItemID")
    @Mapping(target = "toothSide", ignore = true)
    SideInterventionDto sideInterventionDtoToSideInterventionDto(SideIntervention sideIntervention);

    List<SideInterventionDto> sideInterventionDtoToSideInterventionDto(List<SideIntervention> sideIntervention);

}
