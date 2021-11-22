package com.example.resource.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.resource.mapper.MailLogMapper;
import com.example.resource.pojo.MailLog;
import com.example.resource.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
