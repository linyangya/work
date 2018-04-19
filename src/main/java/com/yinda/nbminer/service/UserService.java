package com.yinda.nbminer.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yinda.nbminer.mapper.SysUserMapper;
import com.yinda.nbminer.model.SysUser;
import com.yinda.nbminer.util.ContantUtil;


@Service
public class UserService {
    
    @Autowired
    private SysUserMapper sysUserMapper;
    
    public SysUser getUser(SysUser user) {
            return sysUserMapper.getUser(user);
    }
    
    public PageInfo<SysUser> queryPageByMap(Map<String,Object>map){
        
        //分页插件
        if(map.get(ContantUtil.PAGE_SIZE)!=null && map.get(ContantUtil.CURRENT_PAGE)!=null){
                PageHelper.startPage(Integer.valueOf(map.get(ContantUtil.CURRENT_PAGE).toString()),
                                Integer.valueOf(map.get(ContantUtil.PAGE_SIZE).toString()));
        }
        
        PageInfo<SysUser> pageInfo = new PageInfo<>(sysUserMapper.queryListByMap(map));
        
        return pageInfo;
    }
}
