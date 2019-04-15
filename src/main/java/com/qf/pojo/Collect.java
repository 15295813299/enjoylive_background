package com.qf.pojo;


/**
 * 用户收藏文章表
 */
public class Collect {

  //收藏自增id
  private long collectId;
  //哪个用户收藏的
  private long userInfoId;
  //收藏的哪个文章'
  private long articleId;
  //收藏时间
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


  @Override
  public String toString() {
    return "Collect{" +
            "collectId=" + collectId +
            ", userInfoId=" + userInfoId +
            ", articleId=" + articleId +
            ", collectTime=" + collectTime +
            '}';
  }
}
