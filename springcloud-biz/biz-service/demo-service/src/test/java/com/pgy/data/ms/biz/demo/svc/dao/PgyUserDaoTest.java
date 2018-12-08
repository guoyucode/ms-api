package com.pgy.data.ms.biz.demo.svc.dao;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author ginko
 * @date 2018/12/8 18:28
 */
public class PgyUserDaoTest {

    @Resource
    private PgyUserDao userDao;

    @Test
    public void test() {
        System.out.println(userDao.selectById(1).toString());
    }

}