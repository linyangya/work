package com.yinda.nbminer.mapper;

import com.yinda.nbminer.model.LteNsaEmmSecurityProtectedOutgoingMsg;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface LteNsaEmmSecurityProtectedOutgoingMsgMapper extends Mapper<LteNsaEmmSecurityProtectedOutgoingMsg>{
	
	public LteNsaEmmSecurityProtectedOutgoingMsg getLteNsaEmmSecurityProtectedOutgoingMsg(LteNsaEmmSecurityProtectedOutgoingMsg lteNsaEmmSecurityProtectedOutgoingMsg);

	public List<LteNsaEmmSecurityProtectedOutgoingMsg> queryListByMap(Map<String, Object> map);
	
}