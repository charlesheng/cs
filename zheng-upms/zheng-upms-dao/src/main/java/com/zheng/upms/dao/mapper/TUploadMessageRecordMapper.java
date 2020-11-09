package com.zheng.upms.dao.mapper;

import com.zheng.upms.dao.model.TUploadMessageRecord;
import com.zheng.upms.dao.model.TUploadMessageRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUploadMessageRecordMapper {
    long countByExample(TUploadMessageRecordExample example);

    int deleteByExample(TUploadMessageRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(TUploadMessageRecord record);

    int insertSelective(TUploadMessageRecord record);

    List<TUploadMessageRecord> selectByExample(TUploadMessageRecordExample example);

    TUploadMessageRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUploadMessageRecord record, @Param("example") TUploadMessageRecordExample example);

    int updateByExample(@Param("record") TUploadMessageRecord record, @Param("example") TUploadMessageRecordExample example);

    int updateByPrimaryKeySelective(TUploadMessageRecord record);

    int updateByPrimaryKey(TUploadMessageRecord record);
}