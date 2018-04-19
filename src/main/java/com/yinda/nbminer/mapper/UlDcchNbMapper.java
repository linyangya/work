package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.UlDcchNb;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UlDcchNbMapper extends Mapper<UlDcchNb>{
	
	public UlDcchNb getUlDcchNb(UlDcchNb ulDcchNb);

	public List<UlDcchNb> queryListByMap(Map<String, Object> map);
	
    
}