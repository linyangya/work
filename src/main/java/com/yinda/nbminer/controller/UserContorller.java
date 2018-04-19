package com.yinda.nbminer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yinda.nbminer.service.UserService;
import com.yinda.nbminer.util.ContantUtil;


/**
 * 用户模块
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="user")
public class UserContorller {
    
    @Autowired
    private UserService userService;
    
    /**
     * 获取用户列表
     * @param param
     * @return
     */
    @RequestMapping(value = "/listUser")
    @ResponseBody
    public Map<String,Object> queryUsers(@RequestBody Map<String,Object>param){
            Map<String,Object>map=new HashMap<>();
            map.put(ContantUtil.CODE, ContantUtil.PC_SUCCESS);
            map.put(ContantUtil.DATA, userService.queryPageByMap(param));
            return map;
    }
}
