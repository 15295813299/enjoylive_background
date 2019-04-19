package com.qf.mapper;

public interface DataStatisticsMapper {

    ////文章总数
    Integer getArticleCount();
    //会员数
    Integer getUserCount();
    //回复数
    Integer getCommentCount();
    //浏览数
    Integer getBrowseCount();
    //点赞数
    Integer getSupportCount();
    //当日活跃数
    Integer getLoginCount();



}
