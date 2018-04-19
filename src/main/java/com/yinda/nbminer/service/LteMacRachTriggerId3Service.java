package com.yinda.nbminer.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yinda.nbminer.mapper.LteMacRachTriggerId3Mapper;
import com.yinda.nbminer.model.LteMacRachTriggerId3;
import com.yinda.nbminer.util.ContantUtil;

public class LteMacRachTriggerId3Service {

	@Autowired
	@Qualifier("lteMacRachTriggerId3Mapper")
	private LteMacRachTriggerId3Mapper lteMacRachTriggerId3Mapper;

	public PageInfo<LteMacRachTriggerId3> queryPageByMap(Map<String, Object> map) {

		// 分页插件
		if (map.get(ContantUtil.PAGE_SIZE) != null && map.get(ContantUtil.CURRENT_PAGE) != null) {
			PageHelper.startPage(Integer.valueOf(map.get(ContantUtil.CURRENT_PAGE).toString()),
					Integer.valueOf(map.get(ContantUtil.PAGE_SIZE).toString()));
		}

		PageInfo<LteMacRachTriggerId3> pageInfo = new PageInfo<>(lteMacRachTriggerId3Mapper.queryListByMap(map));

		return pageInfo;
	}
}
