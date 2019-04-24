package com.qf.mapper;

import com.qf.dto.ArticleInfoDto;
import com.qf.dto.UserInfoDto;
import com.qf.vo.ArticleInfoVo;
import com.qf.vo.UserInfoVo;

import java.util.List;

public interface ReportMapper {
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
}
