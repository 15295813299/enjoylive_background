package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.ArticleInfo;
import com.qf.pojo.Category;
import com.qf.service.ArticleInfoService;
import com.qf.dto.ArticleInfoDto;
import com.qf.vo.IdsVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ArticleInfoController {

    @Autowired
    ArticleInfoService articleInfoService;

    /**
     * 获取文章所有信息及条件查询
     * @param
     * @return
     */
    @RequestMapping(value = "getArticleInfo",method = RequestMethod.POST)
    public Object getArticleInfo(@RequestBody(required = false) ArticleInfoDto articleInfoDto){
        PageHelper.startPage(articleInfoDto.getCurrentPage(),articleInfoDto.getPageSize());
        List<ArticleInfoDto> articleInfo = articleInfoService.getArticleInfo(articleInfoDto);
        PageInfo<ArticleInfoDto> articleInfoPageInfo = new PageInfo<ArticleInfoDto>(articleInfo);
        return articleInfoPageInfo;
    }


    /**
     * 获取文章类型
     */
    @RequestMapping(value = "getCategory",method = RequestMethod.POST)
    public Object getCategory(@RequestBody(required = false) Category category ){
        return  articleInfoService.getCategory(category);
    }


    /**
     * 删除文章
     * @param idsVo
     * @return
     */
    @RequestMapping(value = "upArticle",method = RequestMethod.POST)
    public Object upArticle(@RequestBody IdsVo idsVo ){
        return  articleInfoService.upArticle(idsVo);
    }


    /**
     * 获取指定文章
     * @param idsVo
     * @return
     */
    @RequestMapping(value = "getArticleById",method = RequestMethod.POST)
    public Object getArticleById(@RequestBody IdsVo idsVo ){
        return  articleInfoService.getArticleById(idsVo);
    }

}
