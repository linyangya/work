package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteMacRachTrigger;
import com.yinda.nbminer.model.LteMacRachTriggerExample;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteMacRachTriggerMapper extends Mapper<LteMacRachTrigger>{
	
	public LteMacRachTrigger getLteMacRachTrigger(LteMacRachTrigger lteMacRachTrigger);

	public List<LteMacRachTrigger> queryListByMap(Map<String, Object> map);
	
    long countByExample(LteMacRachTriggerExample example);

    int deleteByExample(LteMacRachTriggerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LteMacRachTrigger record);

    int insertSelective(LteMacRachTrigger record);

    List<LteMacRachTrigger> selectByExample(LteMacRachTriggerExample example);

    LteMacRachTrigger selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LteMacRachTrigger record, @Param("example") LteMacRachTriggerExample example);

    int updateByExample(@Param("record") LteMacRachTrigger record, @Param("example") LteMacRachTriggerExample example);

    int updateByPrimaryKeySelective(LteMacRachTrigger record);

    int updateByPrimaryKey(LteMacRachTrigger record);
}