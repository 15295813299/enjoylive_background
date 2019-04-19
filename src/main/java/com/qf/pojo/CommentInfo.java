package com.qf.pojo;


public class CommentInfo {

  private long commentId;
  private long userInfoId;
  private long articleId;
  private String message;
  private java.sql.Timestamp commentDate;


  public long getCommentId() {
    return commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
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


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public java.sql.Timestamp getCommentDate() {
    return commentDate;
  }

  public void setCommentDate(java.sql.Timestamp commentDate) {
    this.commentDate = commentDate;
  }

}
