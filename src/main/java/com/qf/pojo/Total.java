package com.qf.pojo;

/**
 * 统计用户登录信息
 */

public class Total {

  //自增id
  private long totalId;
  //登录的用户
  private long userInfoId;
  //登录的时间（自动生成）
  private java.sql.Timestamp loginTime;
  //登录的ip
  private String loginIp;
  //登录的地址
  private String loginArea;


  public long getTotalId() {
    return totalId;
  }

  public void setTotalId(long totalId) {
    this.totalId = totalId;
  }


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


  public java.sql.Timestamp getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(java.sql.Timestamp loginTime) {
    this.loginTime = loginTime;
  }


  public String getLoginIp() {
    return loginIp;
  }

  public void setLoginIp(String loginIp) {
    this.loginIp = loginIp;
  }


  public String getLoginArea() {
    return loginArea;
  }

  public void setLoginArea(String loginArea) {
    this.loginArea = loginArea;
  }

  @Override
  public String toString() {
    return "Total{" +
            "totalId=" + totalId +
            ", userInfoId=" + userInfoId +
            ", loginTime=" + loginTime +
            ", loginIp='" + loginIp + '\'' +
            ", loginArea='" + loginArea + '\'' +
            '}';
  }
}
