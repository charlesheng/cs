package com.zheng.upms.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.upms.dao.mapper.TestMapper;
import com.zheng.upms.dao.model.Test;
import com.zheng.upms.dao.model.TestExample;
import com.zheng.upms.rpc.api.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TestService实现
* Created by shuzheng on 2020/4/10.
*/
@Service
@Transactional
@BaseService
public class TestServiceImpl extends BaseServiceImpl<TestMapper, Test, TestExample> implements TestService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    TestMapper testMapper;

}