package com.zavier.project.service.mapper;

import com.zavier.project.dal.entity.Area;
import com.zavier.project.service.dto.AreaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AreaDTOMapper {
    AreaDTOMapper INSTANCE = Mappers.getMapper(AreaDTOMapper.class);

    AreaDTO areaToAreaDto(Area area);
}
