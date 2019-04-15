package com.qf.pojo;

/**
 * 用户管理员中间表
 */
public class UserRole {

  //自增id
  private long urId;
  //用户id
  private long userInfoId;
  //管理员id
  private long roleId;
  //状态
  private String flag;

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

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

  @Override
  public String toString() {
    return "UserRole{" +
            "urId=" + urId +
            ", userInfoId=" + userInfoId +
            ", roleId=" + roleId +
            ", flag='" + flag + '\'' +
            '}';
  }
}
