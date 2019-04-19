package com.qf.pojo;


public class LeaveMessage {

  private long leaveMessageId;
  private long userInfoId;
  private long leaveMessageToUser;
  private String leaveMessageText;
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

}
