package com.qf.dto;

public class ArticleInfoDto {
    //文章id
    private long articleId;

    //发表文章用户名
    private String userName;

    //文章类型id
    private long categoryId;

    //文章类型名字
    private String cName;

    //文章标题
    private String title;

    //文章内容
    private String content;

    //文章时间
    private String articleInfoDate;

    //文章状态
    private String flag;

    //文章点赞
    private long sumSup;

    //文章游览量
    private long sumBro;

    //当前页
    private int currentPage;
    //每页显示行数
    private int pageSize=8;


    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getArticleInfoDate() {
        return articleInfoDate;
    }

    public void setArticleInfoDate(String articleInfoDate) {
        this.articleInfoDate = articleInfoDate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public long getSumSup() {
        return sumSup;
    }

    public void setSumSup(long sumSup) {
        this.sumSup = sumSup;
    }

    public long getSumBro() {
        return sumBro;
    }

    public void setSumBro(long sumBro) {
        this.sumBro = sumBro;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "ArticleInfoDto{" +
                "articleId=" + articleId +
                ", userName='" + userName + '\'' +
                ", categoryId=" + categoryId +
                ", cName='" + cName + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", articleInfoDate='" + articleInfoDate + '\'' +
                ", flag='" + flag + '\'' +
                ", sumSup=" + sumSup +
                ", sumBro=" + sumBro +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
