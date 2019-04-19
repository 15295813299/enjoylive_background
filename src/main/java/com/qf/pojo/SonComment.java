package com.qf.pojo;


public class SonComment {

  private long sonCommentId;
  private long commentId;
  private long userInfoId;
  private String message;
  private java.sql.Timestamp sonCommentTime;
  private String flag;


  public long getSonCommentId() {
    return sonCommentId;
  }

  public void setSonCommentId(long sonCommentId) {
    this.sonCommentId = sonCommentId;
  }


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


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public java.sql.Timestamp getSonCommentTime() {
    return sonCommentTime;
  }

  public void setSonCommentTime(java.sql.Timestamp sonCommentTime) {
    this.sonCommentTime = sonCommentTime;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

}
