package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteMacUlTxStat;
import com.yinda.nbminer.model.LteMacUlTxStatExample;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteMacUlTxStatMapper extends Mapper<LteMacUlTxStat>{
	
	public LteMacUlTxStat getLteMacUlTxStat(LteMacUlTxStat lteMacUlTxStat);

	public List<LteMacUlTxStat> queryListByMap(Map<String, Object> map);
	
    long countByExample(LteMacUlTxStatExample example);

    int deleteByExample(LteMacUlTxStatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LteMacUlTxStat record);

    int insertSelective(LteMacUlTxStat record);

    List<LteMacUlTxStat> selectByExample(LteMacUlTxStatExample example);

    LteMacUlTxStat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LteMacUlTxStat record, @Param("example") LteMacUlTxStatExample example);

    int updateByExample(@Param("record") LteMacUlTxStat record, @Param("example") LteMacUlTxStatExample example);

    int updateByPrimaryKeySelective(LteMacUlTxStat record);

    int updateByPrimaryKey(LteMacUlTxStat record);
}