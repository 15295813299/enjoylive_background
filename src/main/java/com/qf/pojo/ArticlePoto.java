package com.qf.pojo;


/**
 * 文章中的多张图片表
 */

public class ArticlePoto {

  //'文章图片自增id
  private long articlePotoId;
  //'文章自增id
  private long articleId;
  //'图片路径'
  private String potoPath;
  //图片状态
  private String flag;



  public long getArticlePotoId() {
    return articlePotoId;
  }

  public void setArticlePotoId(long articlePotoId) {
    this.articlePotoId = articlePotoId;
  }


  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }


  public String getPotoPath() {
    return potoPath;
  }

  public void setPotoPath(String potoPath) {
    this.potoPath = potoPath;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  @Override
  public String toString() {
    return "ArticlePoto{" +
            "articlePotoId=" + articlePotoId +
            ", articleId=" + articleId +
            ", potoPath='" + potoPath + '\'' +
            ", flag='" + flag + '\'' +
            '}';
  }
}
