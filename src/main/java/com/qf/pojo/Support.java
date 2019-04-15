package com.qf.pojo;

/**
 * 点赞表
 */
public class Support {

  //自增id
  private long supportId;
  //点赞的用户id
  private long userInfoId;
  //点赞的文章
  private long articleId;


  public long getSupportId() {
    return supportId;
  }

  public void setSupportId(long supportId) {
    this.supportId = supportId;
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

  @Override
  public String toString() {
    return "Support{" +
            "supportId=" + supportId +
            ", userInfoId=" + userInfoId +
            ", articleId=" + articleId +
            '}';
  }
}
