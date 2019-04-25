package com.qf.controller;

import com.qf.dto.ArticleInfoDto;
import com.qf.dto.UserInfoDto;
import com.qf.service.ReportService;
import com.qf.vo.ArticleInfoVo;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {

    @Autowired
    ReportService service;

    /**
     * 个人信息举报查询
     * @param vo
     * @return
     */
    @RequestMapping(value = "getReportPersonalData",method = RequestMethod.POST)
    public List<UserInfoDto> getReportPersonalData(@RequestBody UserInfoVo vo){
        System.out.println(vo);
        return service.getReportPersonalData(vo);
    }

    @RequestMapping(value = "updateReportPersonalData",method = RequestMethod.POST)
    public int updateReportPersonalData(@RequestBody UserInfoVo vo) {

        return service.updateReportPersonalData(vo);
    }

    /**
     * 获取举报文章
     * @param vo
     * @return
     */
    @RequestMapping(value = "getReportArticleBy",method = RequestMethod.POST)
    List<ArticleInfoDto> getReportArticleBy(@RequestBody ArticleInfoVo vo){
        return service.getReportArticleBy(vo);
    }

    @RequestMapping(value = "updateReportArticleData",method = RequestMethod.POST)
    public Boolean updateReportArticleData(@RequestBody ArticleInfoVo vo) {


        return service.updateReportArticleData(vo);
    }
}
