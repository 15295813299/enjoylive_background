package com.qf.pojo;


public class Violate {

  private long violateId;
  private long userInfoId;
  private long articleId;
  private String violateContent;
  private String violateHref;


  public long getViolateId() {
    return violateId;
  }

  public void setViolateId(long violateId) {
    this.violateId = violateId;
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


  public String getViolateContent() {
    return violateContent;
  }

  public void setViolateContent(String violateContent) {
    this.violateContent = violateContent;
  }


  public String getViolateHref() {
    return violateHref;
  }

  public void setViolateHref(String violateHref) {
    this.violateHref = violateHref;
  }

}
