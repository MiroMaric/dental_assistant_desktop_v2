package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.ToothSideState;
import com.mikomaric.dentalassistant.domain.dto.ToothSideStateDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ToothSideStateMapper {
    
    ToothSideState toothSideStateDtoToToothSideState(ToothSideStateDto dto);
    List<ToothSideState> toothSideStatesDtoToToothSideStates(List<ToothSideStateDto> dtos);
    ToothSideStateDto toothSideStateToToothSideStateDto(ToothSideState toothSideState);
    
}
