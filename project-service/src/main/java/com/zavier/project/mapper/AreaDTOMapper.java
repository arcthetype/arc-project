package com.zavier.project.mapper;

import com.zavier.project.area.entity.Area;
import com.zavier.project.dto.AreaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AreaDTOMapper {
    AreaDTOMapper INSTANCE = Mappers.getMapper(AreaDTOMapper.class);

    AreaDTO areaToAreaDto(Area area);
}
