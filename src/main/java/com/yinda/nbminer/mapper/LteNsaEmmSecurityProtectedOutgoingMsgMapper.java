package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteNsaEmmSecurityProtectedOutgoingMsg;
import com.yinda.nbminer.model.LteNsaEmmSecurityProtectedOutgoingMsgExample;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LteNsaEmmSecurityProtectedOutgoingMsgMapper extends Mapper<LteNsaEmmSecurityProtectedOutgoingMsg>{
	
	public LteNsaEmmSecurityProtectedOutgoingMsg getLteNsaEmmSecurityProtectedOutgoingMsg(LteNsaEmmSecurityProtectedOutgoingMsg lteNsaEmmSecurityProtectedOutgoingMsg);

	public List<LteNsaEmmSecurityProtectedOutgoingMsg> queryListByMap(Map<String, Object> map);
	
    long countByExample(LteNsaEmmSecurityProtectedOutgoingMsgExample example);

    int deleteByExample(LteNsaEmmSecurityProtectedOutgoingMsgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LteNsaEmmSecurityProtectedOutgoingMsg record);

    int insertSelective(LteNsaEmmSecurityProtectedOutgoingMsg record);

    List<LteNsaEmmSecurityProtectedOutgoingMsg> selectByExample(LteNsaEmmSecurityProtectedOutgoingMsgExample example);

    LteNsaEmmSecurityProtectedOutgoingMsg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LteNsaEmmSecurityProtectedOutgoingMsg record, @Param("example") LteNsaEmmSecurityProtectedOutgoingMsgExample example);

    int updateByExample(@Param("record") LteNsaEmmSecurityProtectedOutgoingMsg record, @Param("example") LteNsaEmmSecurityProtectedOutgoingMsgExample example);

    int updateByPrimaryKeySelective(LteNsaEmmSecurityProtectedOutgoingMsg record);

    int updateByPrimaryKey(LteNsaEmmSecurityProtectedOutgoingMsg record);
}