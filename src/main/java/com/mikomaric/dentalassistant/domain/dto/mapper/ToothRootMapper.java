package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.ToothRoot;
import com.mikomaric.dentalassistant.domain.dto.ToothRootDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {ToothMapper.class, ToothRootLabelMapper.class,RootInterventionMapper.class})
public interface ToothRootMapper {

    @Mapping(target = "tooth",ignore = true)
    @Mapping(target = "label", source = "rootLabel")
    ToothRoot toothRootDtoToToothRoot(ToothRootDto dto);
    List<ToothRoot> toothRootDtoToToothRoot(List<ToothRootDto> dtos);
    @Mapping(target = "tooth",ignore = true)
    @Mapping(target = "rootLabel", source = "label")
    ToothRootDto toothRootToToothRootDto(ToothRoot toothRoot);
    List<ToothRootDto> toothRootToToothRootDto(List<ToothRoot> toothRoot);

}
