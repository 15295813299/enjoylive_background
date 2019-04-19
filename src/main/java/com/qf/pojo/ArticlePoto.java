package com.qf.pojo;


public class ArticlePoto {

  private long articlePotoId;
  private long articleId;
  private String potoPath;
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

}
