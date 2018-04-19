package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteMacRachTriggerId3;
import com.yinda.nbminer.model.LteMacRachTriggerId3Example;
import com.yinda.nbminer.model.SysUser;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteMacRachTriggerId3Mapper extends Mapper<LteMacRachTriggerId3> {

	public LteMacRachTriggerId3 getLteMacRachTriggerId3(LteMacRachTriggerId3 lteMacRachTriggerId3);

	public List<LteMacRachTriggerId3> queryListByMap(Map<String, Object> map);

	long countByExample(LteMacRachTriggerId3Example example);

	int deleteByExample(LteMacRachTriggerId3Example example);

	int deleteByPrimaryKey(Integer id);

	int insert(LteMacRachTriggerId3 record);

	int insertSelective(LteMacRachTriggerId3 record);

	List<LteMacRachTriggerId3> selectByExample(LteMacRachTriggerId3Example example);

	LteMacRachTriggerId3 selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") LteMacRachTriggerId3 record,
			@Param("example") LteMacRachTriggerId3Example example);

	int updateByExample(@Param("record") LteMacRachTriggerId3 record,
			@Param("example") LteMacRachTriggerId3Example example);

	int updateByPrimaryKeySelective(LteMacRachTriggerId3 record);

	int updateByPrimaryKey(LteMacRachTriggerId3 record);
}