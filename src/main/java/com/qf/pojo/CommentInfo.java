package com.qf.pojo;


/**
 * 用户评论信息表
 */
public class CommentInfo {

  //自增id
  private long commentId;
  //评论用户的id
  private long userInfoId;
  //评论信息
  private String message;
  //评论的时间（此字段自动生成）
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


  @Override
  public String toString() {
    return "CommentInfo{" +
            "commentId=" + commentId +
            ", userInfoId=" + userInfoId +
            ", message='" + message + '\'' +
            ", commentDate=" + commentDate +
            '}';
  }
}
