package com.example.resource.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.resource.mapper.NationMapper;
import com.example.resource.pojo.Nation;
import com.example.resource.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
