package com.zavier.project.web;

import com.zavier.project.dto.AreaDTO;
import com.zavier.project.res.Result;
import com.zavier.project.service.AreaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {
    private final AreaService areaService;

    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @GetMapping("test")
    public Result<AreaDTO> test() {
        final AreaDTO areaDTO = areaService.areaDTO();
        return Result.wrapSuccessResult(areaDTO);
    }
}
