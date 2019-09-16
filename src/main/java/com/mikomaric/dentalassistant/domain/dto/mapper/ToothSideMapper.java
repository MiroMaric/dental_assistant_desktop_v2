package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.ToothSide;
import com.mikomaric.dentalassistant.domain.dto.ToothSideDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {ToothSideLabelMapper.class, ToothMapper.class,SideInterventionMapper.class})
public interface ToothSideMapper {

    @Mapping(target = "tooth",ignore = true)
    @Mapping(target = "label", source = "sideLabel")
    ToothSide toothSideDtoToToothSide(ToothSideDto dto);
    List<ToothSide> toothSideDtoToToothSide(List<ToothSideDto> dto);
    @Mapping(target = "tooth",ignore = true)
    @Mapping(target = "sideLabel", source = "label")
    ToothSideDto toothSideToToothSideDto(ToothSide toothSide);
    List<ToothSideDto> toothSideToToothSideDto(List<ToothSide> toothSides);

}
