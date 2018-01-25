package com.guigu.InstructionalManage.mapper;

import com.guigu.InstructionalManage.po.MessageInfo;
import com.guigu.InstructionalManage.po.MessageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageInfoMapper {
    int countByExample(MessageInfoExample example);

    int deleteByExample(MessageInfoExample example);

    int deleteByPrimaryKey(Integer messageId1);

    int insert(MessageInfo record);

    int insertSelective(MessageInfo record);

    List<MessageInfo> selectByExample(MessageInfoExample example);

    MessageInfo selectByPrimaryKey(Integer messageId1);

    int updateByExampleSelective(@Param("record") MessageInfo record, @Param("example") MessageInfoExample example);

    int updateByExample(@Param("record") MessageInfo record, @Param("example") MessageInfoExample example);

    int updateByPrimaryKeySelective(MessageInfo record);

    int updateByPrimaryKey(MessageInfo record);
}