package com.qf.pojo;


public class UserRole {

  private long urId;
  private long userInfoId;
  private long roleId;
  private String flag;


  public long getUrId() {
    return urId;
  }

  public void setUrId(long urId) {
    this.urId = urId;
  }


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

}
