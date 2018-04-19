package com.yinda.nbminer.mapper;

import java.util.List;
import java.util.Map;

import com.yinda.nbminer.model.SysUser;

import tk.mybatis.mapper.common.Mapper;

public interface SysUserMapper extends Mapper<SysUser> {
    
    public SysUser getUser(SysUser user);
    
    public List<SysUser> queryListByMap(Map<String,Object>map);
}