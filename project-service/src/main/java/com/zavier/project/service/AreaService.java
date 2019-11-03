package com.zavier.project.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zavier.project.area.entity.Area;
import com.zavier.project.area.mapper.AreaMapper;
import com.zavier.project.dto.AreaDTO;
import com.zavier.project.mapper.AreaDTOMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {
    private final AreaMapper areaMapper;

    public AreaService(AreaMapper areaMapper) {
        this.areaMapper = areaMapper;
    }

    public AreaDTO areaDTO() {
        final List<Area> areas = areaMapper.selectList(Wrappers.<Area>lambdaQuery().last("limit 1"));
        final Area area = areas.get(0);
        final AreaDTO areaDTO = AreaDTOMapper.INSTANCE.areaToAreaDto(area);
        return areaDTO;
    }
}
