package com.yinda.nbminer.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yinda.nbminer.mapper.LteMacRachTriggerMapper;
import com.yinda.nbminer.mapper.LteMacUlTxStatMapper;
import com.yinda.nbminer.mapper.SysUserMapper;
import com.yinda.nbminer.model.LteMacRachTrigger;
import com.yinda.nbminer.model.LteMacUlTxStat;
import com.yinda.nbminer.model.SysUser;
import com.yinda.nbminer.util.ContantUtil;


@Service
public class LteMacUlTxStatService {
    
    @Autowired
    @Qualifier("lteMacUlTxStatMapper")
    private LteMacUlTxStatMapper lteMacUlTxStatMapper ;
    
    public PageInfo<LteMacUlTxStat> queryPageByMap(Map<String,Object>map){
        
        //分页插件
        if(map.get(ContantUtil.PAGE_SIZE)!=null && map.get(ContantUtil.CURRENT_PAGE)!=null){
                PageHelper.startPage(Integer.valueOf(map.get(ContantUtil.CURRENT_PAGE).toString()),
                                Integer.valueOf(map.get(ContantUtil.PAGE_SIZE).toString()));
        }
        
        PageInfo<LteMacUlTxStat> pageInfo = new PageInfo<>(lteMacUlTxStatMapper.queryListByMap(map));
        
        return pageInfo;
    }
}
