package com.qf.pojo;


public class Total {

  private long totalId;
  private long userInfoId;
  private java.sql.Timestamp loginTime;
  private String loginIp;
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

}
