package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteMacUlTxStat;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteMacUlTxStatMapper extends Mapper<LteMacUlTxStat>{
	
	public LteMacUlTxStat getLteMacUlTxStat(LteMacUlTxStat lteMacUlTxStat);

	public List<LteMacUlTxStat> queryListByMap(Map<String, Object> map);
	
    
}