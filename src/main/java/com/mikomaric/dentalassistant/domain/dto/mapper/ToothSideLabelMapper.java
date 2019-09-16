package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.ToothSideLabel;
import com.mikomaric.dentalassistant.domain.dto.ToothSideLabelDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ToothSideLabelMapper {

    ToothSideLabel toothSideLabelDtoToToothSideLabel(ToothSideLabelDto dto);
    List<ToothSideLabel> toothSideLabelsDtoToToothSideLabels(List<ToothSideLabelDto> dto);
    ToothSideLabelDto toothSideLabelToToothSideLabelDto(ToothSideLabel toothSideLabel);

}
