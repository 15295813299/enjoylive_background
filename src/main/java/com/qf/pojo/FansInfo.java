package com.qf.pojo;


/**
 * 粉丝表
 */
public class FansInfo {

  //自增id
  private long fansId;
  //用户id
  private long userInfoId;
  //用户的粉丝
  private long userFans;
  //状态
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


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  @Override
  public String toString() {
    return "FansInfo{" +
            "fansId=" + fansId +
            ", userInfoId=" + userInfoId +
            ", userFans=" + userFans +
            ", flag=" + flag +
            '}';
  }
}
