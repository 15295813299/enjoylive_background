package com.qf.service.impl;

import com.qf.mapper.ArticleInfoMapper;
import com.qf.pojo.ArticleInfo;
import com.qf.pojo.Category;
import com.qf.service.ArticleInfoService;
import com.qf.dto.ArticleInfoDto;
import com.qf.vo.IdsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleInfoServiceImpl implements ArticleInfoService {

    @Autowired
    ArticleInfoMapper articleInfoMapper;

    public List<ArticleInfoDto> getArticleInfo(ArticleInfoDto articleInfoDto) {
        return articleInfoMapper.getArticleInfo(articleInfoDto);
    }

    public List<Category> getCategory(Category category) {
        return articleInfoMapper.getCategory(category);
    }

    public int upArticle(IdsVo idsVo) {
        return articleInfoMapper.upArticle(idsVo);
    }

    public ArticleInfo getArticleById(IdsVo idsVo) {
        return articleInfoMapper.getArticleById(idsVo);
    }
}
