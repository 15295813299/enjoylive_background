package com.qf.pojo;


import java.util.List;

public class ArticleInfo {

  private long articleId;
  private long userInfoId;
  private long categoryId;
  private String title;
  private String content;
  private java.sql.Timestamp articleInfoDate;
  private String flag;


  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
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


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public java.sql.Timestamp getArticleInfoDate() {
    return articleInfoDate;
  }

  public void setArticleInfoDate(java.sql.Timestamp articleInfoDate) {
    this.articleInfoDate = articleInfoDate;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }


}
