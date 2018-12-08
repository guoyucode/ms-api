package com.pgy.data.ms.biz.demo.svc.service.impl;

import com.pgy.data.ms.biz.demo.svc.entity.PgyUser;
import com.pgy.data.ms.biz.demo.svc.dao.PgyUserDao;
import com.pgy.data.ms.biz.demo.svc.service.IPgyUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author ginko
 * @since 2018-12-08
 */
@Service
public class PgyUserServiceImpl extends ServiceImpl<PgyUserDao, PgyUser> implements IPgyUserService {

}
