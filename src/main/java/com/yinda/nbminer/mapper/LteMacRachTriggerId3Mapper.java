package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteMacRachTriggerId3;
import com.yinda.nbminer.model.SysUser;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteMacRachTriggerId3Mapper extends Mapper<LteMacRachTriggerId3> {

	public LteMacRachTriggerId3 getLteMacRachTriggerId3(LteMacRachTriggerId3 lteMacRachTriggerId3);

	public List<LteMacRachTriggerId3> queryListByMap(Map<String, Object> map);

	
}