package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.RootIntervention;
import com.mikomaric.dentalassistant.domain.dto.RootInterventionDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {ToothRootMapper.class, ToothRootStateMapper.class, InterventionItemMapper.class, InterventionMapper.class})
public interface RootInterventionMapper {

//    @Mapping(source = "interventionItemID", target = "itemID")
    @Mapping(target = "toothRoot", ignore = true)
    RootIntervention rootInterventionDtoToRootIntervention(RootInterventionDto dto);

    List<RootIntervention> rootInterventionDtoToRootIntervention(List<RootInterventionDto> dto);
//    @Mapping(source = "itemID", target = "interventionItemID")

    @Mapping(target = "toothRoot", ignore = true)
    RootInterventionDto rootInterventionToRootInterventionDto(RootIntervention rootIntervention);

    List<RootInterventionDto> rootInterventionToRootInterventionDto(List<RootIntervention> rootIntervention);

}
