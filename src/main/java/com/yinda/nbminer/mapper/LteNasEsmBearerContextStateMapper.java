package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteNasEsmBearerContextState;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteNasEsmBearerContextStateMapper extends Mapper<LteNasEsmBearerContextState>{
	
	public LteNasEsmBearerContextState getLteNasEsmBearerContextState(LteNasEsmBearerContextState lteNasEsmBearerContextState);

	public List<LteNasEsmBearerContextState> queryListByMap(Map<String, Object> map);
	
    
}