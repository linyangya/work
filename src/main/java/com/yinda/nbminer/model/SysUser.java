package com.yinda.nbminer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 主键
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "user_pwd")
    private String userPwd;

    /**
     * 手机
     */
    private Long mobile;

    /**
     * 邮箱
     */
    @Column(name = "user_mail")
    private String userMail;

    /**
     * 状态（1：正常，2：删除）
     */
    @Column(name = "user_status")
    private String userStatus;

    /**
     * 级别(0:普通用户，1:级别)
     */
    @Column(name = "user_level")
    private String userLevel;

    /**
     * 创建时间
     */
    @Column(name = "crt_time")
    private Date crtTime;

    /**
     * 修改时间
     */
    @Column(name = "upd_time")
    private Date updTime;

    /**
     * 获取主键
     *
     * @return user_id - 主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置主键
     *
     * @param userId 主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取登录名
     *
     * @return login_name - 登录名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录名
     *
     * @param loginName 登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取姓名
     *
     * @return user_name - 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置姓名
     *
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return user_pwd - 密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 设置密码
     *
     * @param userPwd 密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public Long getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取邮箱
     *
     * @return user_mail - 邮箱
     */
    public String getUserMail() {
        return userMail;
    }

    /**
     * 设置邮箱
     *
     * @param userMail 邮箱
     */
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    /**
     * 获取状态（1：正常，2：删除）
     *
     * @return user_status - 状态（1：正常，2：删除）
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * 设置状态（1：正常，2：删除）
     *
     * @param userStatus 状态（1：正常，2：删除）
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取级别(0:普通用户，1:级别)
     *
     * @return user_level - 级别(0:普通用户，1:级别)
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     * 设置级别(0:普通用户，1:级别)
     *
     * @param userLevel 级别(0:普通用户，1:级别)
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 获取创建时间
     *
     * @return crt_time - 创建时间
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * 设置创建时间
     *
     * @param crtTime 创建时间
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * 获取修改时间
     *
     * @return upd_time - 修改时间
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * 设置修改时间
     *
     * @param updTime 修改时间
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}