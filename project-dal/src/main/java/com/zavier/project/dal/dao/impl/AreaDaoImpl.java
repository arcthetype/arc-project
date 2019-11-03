package com.zavier.project.dal.dao.impl;

import com.zavier.project.dal.entity.Area;
import com.zavier.project.dal.mapper.AreaMapper;
import com.zavier.project.dal.dao.AreaDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地区表 服务实现类
 * </p>
 *
 * @author zhengwei
 * @since 2019-11-03
 */
@Service
public class AreaDaoImpl extends ServiceImpl<AreaMapper, Area> implements AreaDao {

}
