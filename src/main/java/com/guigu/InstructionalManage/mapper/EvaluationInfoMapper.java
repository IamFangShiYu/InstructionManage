package com.guigu.InstructionalManage.mapper;

import com.guigu.InstructionalManage.po.EvaluationInfo;
import com.guigu.InstructionalManage.po.EvaluationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluationInfoMapper {
    int countByExample(EvaluationInfoExample example);

    int deleteByExample(EvaluationInfoExample example);

    int deleteByPrimaryKey(Integer evaluationId);

    int insert(EvaluationInfo record);

    int insertSelective(EvaluationInfo record);

    List<EvaluationInfo> selectByExample(EvaluationInfoExample example);

    EvaluationInfo selectByPrimaryKey(Integer evaluationId);

    int updateByExampleSelective(@Param("record") EvaluationInfo record, @Param("example") EvaluationInfoExample example);

    int updateByExample(@Param("record") EvaluationInfo record, @Param("example") EvaluationInfoExample example);

    int updateByPrimaryKeySelective(EvaluationInfo record);

    int updateByPrimaryKey(EvaluationInfo record);
}