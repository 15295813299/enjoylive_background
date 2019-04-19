package com.qf.dto;

import java.sql.Timestamp;
import java.util.Date;

public class RoleInfoDto {
    private long roleId;
    private long userInfoId;
    private String username;
    private String roleDescribe;
    private String rule;
    private String name;
    private String phone;
    private String email;
    private String roleName;
    private String registrationDate;
    private String flag;
    private String status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRegistrationDate() {

        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getFlag() {
        if ("2".equals(flag)){
            flag="layui-btn layui-btn-disabled";
            status="停用";
        }else {
            flag="layui-btn";
            status="启用";
        }
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
