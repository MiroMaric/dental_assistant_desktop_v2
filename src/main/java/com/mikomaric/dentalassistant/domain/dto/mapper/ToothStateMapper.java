
package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.ToothState;
import com.mikomaric.dentalassistant.domain.dto.ToothStateDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ToothStateMapper {
    
    ToothState toothStateDtoToToothState(ToothStateDto dto);
    List<ToothState> toothStatesDtoToToothStates(List<ToothStateDto> dtos);
    ToothStateDto toothStateToToothStateDto(ToothState toothState);
    
}
