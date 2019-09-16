package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.ToothIntervention;
import com.mikomaric.dentalassistant.domain.dto.ToothInterventionDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {ToothMapper.class, ToothStateMapper.class, InterventionItemMapper.class, InterventionMapper.class})
public interface ToothInterventionMapper {

    @Mapping(source = "toothState", target = "state")
//    @Mapping(source = "interventionItemID", target = "itemID")
    @Mapping(target = "tooth", ignore = true)
    ToothIntervention toothInterventiondDtoToToothIntervention(ToothInterventionDto dto);

    List<ToothIntervention> toothInterventiondDtoToToothIntervention(List<ToothInterventionDto> dto);

    @Mapping(source = "state", target = "toothState")
//    @Mapping(source = "itemID", target = "interventionItemID")
    @Mapping(target = "tooth", ignore = true)
    ToothInterventionDto toothInterventionToToothInterventionDto(ToothIntervention toothIntervention);

    List<ToothInterventionDto> toothInterventionToToothInterventionDto(List<ToothIntervention> toothIntervention);

}
