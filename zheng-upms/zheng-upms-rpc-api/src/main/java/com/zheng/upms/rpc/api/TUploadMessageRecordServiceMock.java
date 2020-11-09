package com.zheng.upms.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.zheng.upms.dao.mapper.TUploadMessageRecordMapper;
import com.zheng.upms.dao.model.TUploadMessageRecord;
import com.zheng.upms.dao.model.TUploadMessageRecordExample;

/**
* 降级实现TUploadMessageRecordService接口
* Created by shuzheng on 2020/4/10.
*/
public class TUploadMessageRecordServiceMock extends BaseServiceMock<TUploadMessageRecordMapper, TUploadMessageRecord, TUploadMessageRecordExample> implements TUploadMessageRecordService {

}
