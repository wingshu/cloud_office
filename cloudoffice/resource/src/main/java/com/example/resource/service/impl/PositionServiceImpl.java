package com.example.resource.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.resource.mapper.PositionMapper;
import com.example.resource.pojo.Position;
import com.example.resource.service.IPositionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xushumin
 * @since 2021-11-22
 */
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
