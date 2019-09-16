package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.ToothRootLabel;
import com.mikomaric.dentalassistant.domain.dto.ToothRootLabelDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ToothRootLabelMapper {
    
    ToothRootLabel toothRootLabelDtoToToothRootLabel(ToothRootLabelDto dto);
    List<ToothRootLabel> toothRootLabelDtoToToothRootLabel(List<ToothRootLabelDto> dto);
    ToothRootLabelDto toothRootLabelToToothRootLabelDto(ToothRootLabel toothRootLabel);
    
}
