package com.qf.pojo;


public class Collect {

  private long collectId;
  private long userInfoId;
  private long articleId;
  private java.sql.Timestamp collectTime;


  public long getCollectId() {
    return collectId;
  }

  public void setCollectId(long collectId) {
    this.collectId = collectId;
  }


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }


  public java.sql.Timestamp getCollectTime() {
    return collectTime;
  }

  public void setCollectTime(java.sql.Timestamp collectTime) {
    this.collectTime = collectTime;
  }

}
