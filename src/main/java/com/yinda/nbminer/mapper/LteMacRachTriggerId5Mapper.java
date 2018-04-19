package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteMacRachTriggerId5;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteMacRachTriggerId5Mapper extends Mapper<LteMacRachTriggerId5>{

	public LteMacRachTriggerId5 getLteMacRachTriggerId5(LteMacRachTriggerId5 lteMacRachTriggerId5);

	public List<LteMacRachTriggerId5> queryListByMap(Map<String, Object> map);

	
}