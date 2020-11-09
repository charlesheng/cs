package com.zheng.upms.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.upms.dao.mapper.TestMapper;
import com.zheng.upms.dao.model.Test;
import com.zheng.upms.dao.model.TestExample;

/**
* 降级实现TestService接口
* Created by shuzheng on 2020/4/10.
*/
public class TestServiceMock extends BaseServiceMock<TestMapper, Test, TestExample> implements TestService {

}
