package com.qf.vo;


import java.util.List;

public class UserRoleVo {

  private long urId;
  private long userInfoId;
  private List<RoleInfoVo> role;
  private int flag;


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


  public List<RoleInfoVo> getRoleId() {
    return role;
  }

  public void setRoleId(List<RoleInfoVo> roleId) {
    this.role = roleId;
  }


  public int getFlag() {
    return flag;
  }

  public void setFlag(int flag) {
    this.flag = flag;
  }

}
