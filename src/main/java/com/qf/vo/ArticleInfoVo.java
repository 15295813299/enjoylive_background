package com.qf.vo;


public class ArticleInfoVo extends SearchVo {

  private long articleId;
  private long userInfoId;
  private long uId;
  private int vFlag=-1;
  private long categoryId;
  private String title;
  private String content;
  private String articleInfoDate;
  private int flag=-1;
  private String uname;
  private String violateId;
  private String violateContent;
  private String username;
  private int[] ids;


  public int getvFlag() {
    return vFlag;
  }

  public void setvFlag(int vFlag) {
    this.vFlag = vFlag;
  }

  public int[] getIds() {
    return ids;
  }

  public void setIds(int[] ids) {
    this.ids = ids;
  }

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

  public long getuId() {
    return uId;
  }

  public void setuId(long uId) {
    this.uId = uId;
  }

  public String getArticleInfoDate() {
    return articleInfoDate;
  }

  public void setArticleInfoDate(String articleInfoDate) {
    this.articleInfoDate = articleInfoDate;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getViolateId() {
    return violateId;
  }

  public void setViolateId(String violateId) {
    this.violateId = violateId;
  }

  public String getViolateContent() {
    return violateContent;
  }

  public void setViolateContent(String violateContent) {
    this.violateContent = violateContent;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public void setUsername(String username) {
    this.username = username;
  }

  public int getFlag() {
    return flag;
  }

  public void setFlag(int flag) {
    this.flag = flag;
  }


}
