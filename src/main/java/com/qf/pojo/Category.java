package com.qf.pojo;

/**
 * 类别表
 */

public class Category {

  //类别id
  private long categoryId;
  //类别名
  private String categoryName;
  //类别大图
  private String categoryPoto;
  //类别小图
  private String categoryLogo;
  //父类id
  private long parentId;
  //状态
  private String flag;


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public String getCategoryPoto() {
    return categoryPoto;
  }

  public void setCategoryPoto(String categoryPoto) {
    this.categoryPoto = categoryPoto;
  }


  public String getCategoryLogo() {
    return categoryLogo;
  }

  public void setCategoryLogo(String categoryLogo) {
    this.categoryLogo = categoryLogo;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }


  @Override
  public String toString() {
    return "Category{" +
            "categoryId=" + categoryId +
            ", categoryName='" + categoryName + '\'' +
            ", categoryPoto='" + categoryPoto + '\'' +
            ", categoryLogo='" + categoryLogo + '\'' +
            ", parentId=" + parentId +
            ", flag='" + flag + '\'' +
            '}';
  }
}
