package com.qf.service;

import com.qf.dto.ArticleInfoDto;
import com.qf.dto.UserInfoDto;
import com.qf.vo.ArticleInfoVo;
import com.qf.vo.UserInfoVo;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface ReportService {
    /**
     * 个人信息举报查询
     * @param vo
     * @return
     */
    public List<UserInfoDto> getReportPersonalData(UserInfoVo vo);

    /**
     * 更新个人信息举报的状态
     * @param vo
     * @return
     */
    int updateReportPersonalData(UserInfoVo vo);

    /**
     * 获取举报文章
     * @param vo
     * @return
     */
    List<ArticleInfoDto> getReportArticleBy(ArticleInfoVo vo);

    /**
     * 更新文章状态
     * @param vo
     * @return
     */
    Boolean updateReportArticleData(ArticleInfoVo vo);
}
