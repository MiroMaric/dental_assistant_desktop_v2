package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.ToothRootState;
import com.mikomaric.dentalassistant.domain.dto.ToothRootStateDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ToothRootStateMapper {
    
    ToothRootState toothRootStateDtoToToothRootState(ToothRootStateDto dto);
    List<ToothRootState> toothRootStateDtoToToothRootState(List<ToothRootStateDto> dto);
    ToothRootStateDto toothRootStateToToothRootStateDto(ToothRootState toothRootState);
    
}
