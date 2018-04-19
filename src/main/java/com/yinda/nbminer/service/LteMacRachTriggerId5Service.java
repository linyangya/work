package com.yinda.nbminer.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yinda.nbminer.mapper.LteMacRachTriggerMapper;
import com.yinda.nbminer.model.LteMacRachTrigger;
import com.yinda.nbminer.util.ContantUtil;

public class LteMacRachTriggerId5Service {

	@Autowired
	@Qualifier("lteMacRachTriggerMapper")
	private LteMacRachTriggerMapper lteMacRachTriggerMapper;

	public PageInfo<LteMacRachTrigger> queryPageByMap(Map<String, Object> map) {

		// 分页插件
		if (map.get(ContantUtil.PAGE_SIZE) != null && map.get(ContantUtil.CURRENT_PAGE) != null) {
			PageHelper.startPage(Integer.valueOf(map.get(ContantUtil.CURRENT_PAGE).toString()),
					Integer.valueOf(map.get(ContantUtil.PAGE_SIZE).toString()));
		}

		PageInfo<LteMacRachTrigger> pageInfo = new PageInfo<>(lteMacRachTriggerMapper.queryListByMap(map));

		return pageInfo;
	}
}
