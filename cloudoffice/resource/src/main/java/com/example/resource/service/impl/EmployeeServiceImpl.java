package com.example.resource.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.resource.mapper.EmployeeMapper;
import com.example.resource.pojo.Employee;
import com.example.resource.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
