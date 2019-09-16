package com.mikomaric.dentalassistant.domain.dto.mapper;

import com.mikomaric.dentalassistant.domain.Tooth;
import com.mikomaric.dentalassistant.domain.dto.ToothDto;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {ToothLabelMapper.class,PatientMapper.class,ToothSideMapper.class,ToothRootMapper.class,ToothStateMapper.class,ToothInterventionMapper.class})
public interface ToothMapper {
    @Mapping(target = "patient",ignore = true)
    @Mapping(target = "label", source = "toothLabel")
    @Mapping(target = "roots", source = "toothRoots")
    @Mapping(target = "sides", source = "toothSides")
    Tooth toothDtoToTooth(ToothDto dto);
    List<Tooth> toothDtoToTooth(List<ToothDto> dtos);
    @Mapping(target = "patient",ignore = true)
    @Mapping(target = "toothLabel",source = "label")
    @Mapping(target = "toothRoots",source = "roots")
    @Mapping(target = "toothSides",source = "sides")
    @InheritInverseConfiguration
    ToothDto toothToToothDto(Tooth tooth);
    List<ToothDto> toothToToothDto(List<Tooth> teeth);

    
}
