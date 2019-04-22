package com.qf.service;

import com.qf.pojo.ArticleInfo;
import com.qf.dto.ArticleInfoDto;
import com.qf.pojo.Category;
import com.qf.vo.IdsVo;

import java.util.List;

public interface ArticleInfoService {

    /**
     * 获取文章及点赞数游览量，可根据条件查询，
     * @param articleInfovo
     * @return
     */
    public List<ArticleInfoDto> getArticleInfo(ArticleInfoDto articleInfovo);

    /**
     * 获取文章类型文章
     * @param category
     * @return
     */
    public List<Category> getCategory(Category category);

    int upArticle(IdsVo idsVo);

    ArticleInfo getArticleById(IdsVo idsVo);
}
