
package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.ToothLabel;
import com.mikomaric.dentalassistant.domain.dto.ToothLabelDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface ToothLabelMapper {
    
    ToothLabel toothLabelDtoToToothLabel(ToothLabelDto dto);
    List<ToothLabel> toothLabelsDtoToToothLabels(List<ToothLabelDto> dtos);
    ToothLabelDto toothLabelToToothLabelDto(ToothLabel toothLabel);
}
