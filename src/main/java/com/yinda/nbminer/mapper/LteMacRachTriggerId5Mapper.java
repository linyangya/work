package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteMacRachTriggerId5;
import com.yinda.nbminer.model.LteMacRachTriggerId5Example;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteMacRachTriggerId5Mapper extends Mapper<LteMacRachTriggerId5>{

	public LteMacRachTriggerId5 getLteMacRachTriggerId5(LteMacRachTriggerId5 lteMacRachTriggerId5);

	public List<LteMacRachTriggerId5> queryListByMap(Map<String, Object> map);

	long countByExample(LteMacRachTriggerId5Example example);

	int deleteByExample(LteMacRachTriggerId5Example example);

	int deleteByPrimaryKey(Integer id);

	int insert(LteMacRachTriggerId5 record);

	int insertSelective(LteMacRachTriggerId5 record);

	List<LteMacRachTriggerId5> selectByExample(LteMacRachTriggerId5Example example);

	LteMacRachTriggerId5 selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") LteMacRachTriggerId5 record,
			@Param("example") LteMacRachTriggerId5Example example);

	int updateByExample(@Param("record") LteMacRachTriggerId5 record,
			@Param("example") LteMacRachTriggerId5Example example);

	int updateByPrimaryKeySelective(LteMacRachTriggerId5 record);

	int updateByPrimaryKey(LteMacRachTriggerId5 record);
}