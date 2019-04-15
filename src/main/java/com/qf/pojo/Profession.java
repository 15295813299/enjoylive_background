package com.qf.pojo;

/**
 * 喜欢的板块
 */
public class Profession {

  //自增id
  private long professionId;
  //用户id
  private long userInfoId;
  //板块id
  private long categoryId;


  public long getProfessionId() {
    return professionId;
  }

  public void setProfessionId(long professionId) {
    this.professionId = professionId;
  }


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }

  @Override
  public String toString() {
    return "Profession{" +
            "professionId=" + professionId +
            ", userInfoId=" + userInfoId +
            ", categoryId=" + categoryId +
            '}';
  }
}
