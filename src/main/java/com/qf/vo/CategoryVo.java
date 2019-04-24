package com.qf.vo;

import java.io.Serializable;

public class CategoryVo extends SearchVo implements Serializable {
    private long categoryId;
    private String categoryName;
    private String categoryPoto;
    private String categoryLogo;
    private long parentId;
    private int flag=-1;
    private int flagf=-1;
    private int[] ids;

    public int getFlag() {
        return flag;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getFlagf() {
        return flagf;
    }

    public void setFlagf(int flagf) {
        this.flagf = flagf;
    }

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

}
