package com.qf.pojo;

/**
 * 浏览次数表
 *
 */
public class BrowseInfo {

  //
  private long browseInfoId;
  //文章的主键
  private long articleId;
  //用户的自增id
  private long userInfoId;
  //状态
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
    return "BrowseInfo{" +
            "browseInfoId=" + browseInfoId +
            ", articleId=" + articleId +
            ", userInfoId=" + userInfoId +
            ", flag='" + flag + '\'' +
            '}';
  }
}
