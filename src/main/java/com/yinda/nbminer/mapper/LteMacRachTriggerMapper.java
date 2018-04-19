package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteMacRachTrigger;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteMacRachTriggerMapper extends Mapper<LteMacRachTrigger>{
	
	public LteMacRachTrigger getLteMacRachTrigger(LteMacRachTrigger lteMacRachTrigger);

	public List<LteMacRachTrigger> queryListByMap(Map<String, Object> map);
	
   
}