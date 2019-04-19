package com.qf.pojo;


public class BrowseInfo {

  private long browseInfoId;
  private long articleId;
  private String userIp;
  private String userMac;
  private String flag;


  public long getBrowseInfoId() {
    return browseInfoId;
  }

  public void setBrowseInfoId(long browseInfoId) {
    this.browseInfoId = browseInfoId;
  }


  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }


  public String getUserIp() {
    return userIp;
  }

  public void setUserIp(String userIp) {
    this.userIp = userIp;
  }


  public String getUserMac() {
    return userMac;
  }

  public void setUserMac(String userMac) {
    this.userMac = userMac;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

}
