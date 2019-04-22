package com.qf.mapper;

import com.qf.pojo.ArticleInfo;
import com.qf.dto.ArticleInfoDto;
import com.qf.pojo.Category;
import com.qf.vo.IdsVo;

import java.util.List;

public interface ArticleInfoMapper {

    List<ArticleInfoDto> getArticleInfo(ArticleInfoDto articleInfoDto);

    List<Category> getCategory(Category category);

    int upArticle(IdsVo idsVo);

    ArticleInfo getArticleById(IdsVo idsVo);
}
