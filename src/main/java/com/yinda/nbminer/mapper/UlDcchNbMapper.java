package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.UlDcchNb;
import com.yinda.nbminer.model.UlDcchNbExample;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UlDcchNbMapper extends Mapper<UlDcchNb>{
	
	public UlDcchNb getUlDcchNb(UlDcchNb ulDcchNb);

	public List<UlDcchNb> queryListByMap(Map<String, Object> map);
	
    long countByExample(UlDcchNbExample example);

    int deleteByExample(UlDcchNbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UlDcchNb record);

    int insertSelective(UlDcchNb record);

    List<UlDcchNb> selectByExample(UlDcchNbExample example);

    UlDcchNb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UlDcchNb record, @Param("example") UlDcchNbExample example);

    int updateByExample(@Param("record") UlDcchNb record, @Param("example") UlDcchNbExample example);

    int updateByPrimaryKeySelective(UlDcchNb record);

    int updateByPrimaryKey(UlDcchNb record);
}