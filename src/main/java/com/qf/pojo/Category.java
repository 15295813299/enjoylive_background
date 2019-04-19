package com.qf.pojo;


public class Category {

  private long categoryId;
  private String categoryName;
  private String categoryPoto;
  private String categoryLogo;
  private long parentId;
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

}
