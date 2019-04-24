package com.qf.vo;


import java.util.Arrays;

public class RoleInfoVo extends SearchVo {

    private long roleId;
    private String roleName;
    private String roleDescribe;
    private String rule;
    private int flag = -1;
    private int flagf = -1;
    private Integer pageSize = 100;
    private Integer currentPage = 1;
    private Integer[] roleIds;



    public Integer[] getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Integer[] roleIds) {
        this.roleIds = roleIds;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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


    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getFlagf() {
        return flagf;
    }

    public void setFlagf(int flagf) {
        this.flagf = flagf;
    }

    @Override
    public String toString() {
        return "RoleInfoVo{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDescribe='" + roleDescribe + '\'' +
                ", rule='" + rule + '\'' +
                ", flag=" + flag +
                ", flagf=" + flagf +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", roleIds=" + Arrays.toString(roleIds) +
                '}';
    }
}
