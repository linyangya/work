package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteNasEsmBearerContextState;
import com.yinda.nbminer.model.LteNasEsmBearerContextStateExample;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteNasEsmBearerContextStateMapper extends Mapper<LteNasEsmBearerContextState>{
	
	public LteNasEsmBearerContextState getLteNasEsmBearerContextState(LteNasEsmBearerContextState lteNasEsmBearerContextState);

	public List<LteNasEsmBearerContextState> queryListByMap(Map<String, Object> map);
	
    long countByExample(LteNasEsmBearerContextStateExample example);

    int deleteByExample(LteNasEsmBearerContextStateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LteNasEsmBearerContextState record);

    int insertSelective(LteNasEsmBearerContextState record);

    List<LteNasEsmBearerContextState> selectByExample(LteNasEsmBearerContextStateExample example);

    LteNasEsmBearerContextState selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LteNasEsmBearerContextState record, @Param("example") LteNasEsmBearerContextStateExample example);

    int updateByExample(@Param("record") LteNasEsmBearerContextState record, @Param("example") LteNasEsmBearerContextStateExample example);

    int updateByPrimaryKeySelective(LteNasEsmBearerContextState record);

    int updateByPrimaryKey(LteNasEsmBearerContextState record);
}