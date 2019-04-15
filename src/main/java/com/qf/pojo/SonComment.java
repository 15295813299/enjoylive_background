package com.qf.pojo;


/**
 * 子评论
 */
public class SonComment {

  //自增id
  private long sonCommentId;
  //评论信息表id
  private long commentId;
  //子评论的用户
  private long userInfoId;
  //子评论信息
  private String message;
  //评论的时间
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

  @Override
  public String toString() {
    return "SonComment{" +
            "sonCommentId=" + sonCommentId +
            ", commentId=" + commentId +
            ", userInfoId=" + userInfoId +
            ", message='" + message + '\'' +
            ", sonCommentTime=" + sonCommentTime +
            ", flag='" + flag + '\'' +
            '}';
  }
}
