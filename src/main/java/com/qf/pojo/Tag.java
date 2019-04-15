package com.qf.pojo;


/**
 * 标签表
 */

public class Tag {

  //标签id
  private long tagId;
  //标签名字
  private long tagName;
  //标签搜索次数
  private long total;
  private String flag;


  public long getTagId() {
    return tagId;
  }

  public void setTagId(long tagId) {
    this.tagId = tagId;
  }


  public long getTagName() {
    return tagName;
  }

  public void setTagName(long tagName) {
    this.tagName = tagName;
  }


  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  @Override
  public String toString() {
    return "Tag{" +
            "tagId=" + tagId +
            ", tagName=" + tagName +
            ", total=" + total +
            ", flag='" + flag + '\'' +
            '}';
  }
}
