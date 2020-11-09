package com.zheng.upms.rpc.service.impl;

import com.zheng.common.annotation.BaseService;
import com.zheng.common.base.BaseServiceImpl;
import com.zheng.upms.dao.mapper.TUploadMessageRecordMapper;
import com.zheng.upms.dao.model.TUploadMessageRecord;
import com.zheng.upms.dao.model.TUploadMessageRecordExample;
import com.zheng.upms.rpc.api.TUploadMessageRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TUploadMessageRecordService实现
* Created by shuzheng on 2020/4/10.
*/
@Service
@Transactional
@BaseService
public class TUploadMessageRecordServiceImpl extends BaseServiceImpl<TUploadMessageRecordMapper, TUploadMessageRecord, TUploadMessageRecordExample> implements TUploadMessageRecordService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TUploadMessageRecordServiceImpl.class);

    @Autowired
    TUploadMessageRecordMapper tUploadMessageRecordMapper;

}