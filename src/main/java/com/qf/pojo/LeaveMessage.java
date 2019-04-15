package com.qf.pojo;


/**
 * 留言表
 */
public class LeaveMessage {
  //留言表自增id
  private long leaveMessageId;
  //留言的id
  private long userInfoId;
  //留给谁的
  private long leaveMessageToUser;
  //留言信息
  private String leaveMessageText;
  //留言时间
  private java.sql.Timestamp leaveMessageTime;


  public long getLeaveMessageId() {
    return leaveMessageId;
  }

  public void setLeaveMessageId(long leaveMessageId) {
    this.leaveMessageId = leaveMessageId;
  }


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


  public long getLeaveMessageToUser() {
    return leaveMessageToUser;
  }

  public void setLeaveMessageToUser(long leaveMessageToUser) {
    this.leaveMessageToUser = leaveMessageToUser;
  }


  public String getLeaveMessageText() {
    return leaveMessageText;
  }

  public void setLeaveMessageText(String leaveMessageText) {
    this.leaveMessageText = leaveMessageText;
  }


  public java.sql.Timestamp getLeaveMessageTime() {
    return leaveMessageTime;
  }

  public void setLeaveMessageTime(java.sql.Timestamp leaveMessageTime) {
    this.leaveMessageTime = leaveMessageTime;
  }

  @Override
  public String toString() {
    return "LeaveMessage{" +
            "leaveMessageId=" + leaveMessageId +
            ", userInfoId=" + userInfoId +
            ", leaveMessageToUser=" + leaveMessageToUser +
            ", leaveMessageText='" + leaveMessageText + '\'' +
            ", leaveMessageTime=" + leaveMessageTime +
            '}';
  }
}
