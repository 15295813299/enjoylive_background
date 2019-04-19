package com.qf.pojo;


public class FansInfo {

  private long fansId;
  private long userInfoId;
  private long userFans;
  private String flag;


  public long getFansId() {
    return fansId;
  }

  public void setFansId(long fansId) {
    this.fansId = fansId;
  }


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


  public long getUserFans() {
    return userFans;
  }

  public void setUserFans(long userFans) {
    this.userFans = userFans;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

}
