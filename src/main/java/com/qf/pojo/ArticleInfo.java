package com.qf.pojo;


/**
 * 文章信息表
 */
public class ArticleInfo {

  //文章自增id
  private long articleId;
  //'用户Id自增主键'
  private long userInfoId;
  //'类别id'
  private long categoryId;
  //'文章标题'
  private String title;
  //'文章内容'
  private String content;
  //'发帖时间
  private java.sql.Timestamp articleInfoDate;
  //'文章状态'(0删除，1展示)
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


  @Override
  public String toString() {
    return "ArticleInfo{" +
            "articleId=" + articleId +
            ", userInfoId=" + userInfoId +
            ", categoryId=" + categoryId +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", articleInfoDate=" + articleInfoDate +
            ", flag='" + flag + '\'' +
            '}';
  }
}
