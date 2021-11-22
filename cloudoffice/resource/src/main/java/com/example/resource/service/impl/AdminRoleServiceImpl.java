package com.example.resource.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.resource.mapper.AdminRoleMapper;
import com.example.resource.pojo.AdminRole;
import com.example.resource.service.IAdminRoleService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements IAdminRoleService {

}
