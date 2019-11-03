package com.zavier.project.area.service.impl;

import com.alibaba.fastjson.JSON;
import com.zavier.project.area.entity.Area;
import com.zavier.project.area.mapper.AreaMapper;
import com.zavier.project.area.service.AreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class AreaServiceImpl implements AreaService {
    private final AreaMapper areaMapper;

    public AreaServiceImpl(AreaMapper areaMapper) {
        this.areaMapper = areaMapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void test() {
        final Area area = new Area();
        area.setName("dddd");
        area.setParentId(0000);
        areaMapper.insert(area);
        log.info("area:{}", JSON.toJSONString(area));
        throw new RuntimeException("xx");
    }
}
