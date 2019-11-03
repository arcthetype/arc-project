package com.zavier.project.area.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zavier.project.area.entity.Area;
import com.zavier.project.area.mapper.AreaMapper;
import com.zavier.project.area.service.AreaService;
import com.zavier.project.common.PageR;
import com.zavier.project.common.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 地区表 前端控制器
 * </p>
 *
 * @author zhengwei
 * @since 2019-11-03
 */
@Controller
@RequestMapping("/area/area")
public class AreaController {
    private final AreaMapper areaMapper;
    private final AreaService areaService;

    public AreaController(AreaMapper areaMapper, AreaService areaService) {
        this.areaMapper = areaMapper;
        this.areaService = areaService;
    }

    @GetMapping("list")
    public PageR<Area> list() {
        final Page<Area> areaPage = new Page<>(0, 10);
        final IPage<Area> areaIPage = areaMapper.selectPage(areaPage, Wrappers.emptyWrapper());
        final long total = areaIPage.getTotal();
        final List<Area> records = areaIPage.getRecords();
        return PageR.wrapSuccessResult(records, (int)total);
    }

    @GetMapping("add")
    public R<Area> add() {
        final Area area = new Area();
        area.setName("thisis name");
        area.setParentId(0000);
        areaMapper.insert(area);
        return R.wrapSuccessResult(area);
    }

    @GetMapping("test")
    public R<Boolean> test() {
        areaService.test();
        return R.wrapSuccessResult(true);
    }
}
