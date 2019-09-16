package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.Intervention;
import com.mikomaric.dentalassistant.domain.dto.InterventionDto;
import java.util.List;
import org.mapstruct.Mapper;


@Mapper(uses = {InterventionItemMapper.class,UserMapper.class})
public interface InterventionMapper {
    
    Intervention interventionDtoToIntervention(InterventionDto dto);
    List<Intervention> interventionDtoToIntervention(List<InterventionDto> dtos);
    InterventionDto interventionToInterventionDto(Intervention intervention);
    List<InterventionDto> interventionToInterventionDto(List<Intervention> interventions);
    
}
