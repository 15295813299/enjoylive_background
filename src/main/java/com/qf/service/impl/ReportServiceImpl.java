package com.qf.service.impl;

import com.qf.dto.ArticleInfoDto;
import com.qf.dto.UserInfoDto;
import com.qf.mapper.ReportMapper;
import com.qf.service.ReportService;
import com.qf.vo.ArticleInfoVo;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    ReportMapper mapper;

    public List<UserInfoDto> getReportPersonalData(UserInfoVo vo) {
        return mapper.getReportPersonalData(vo);
    }

    public int updateReportPersonalData(UserInfoVo vo) {
        return mapper.updateReportPersonalData(vo);
    }

    @Override
    public List<ArticleInfoDto> getReportArticleBy(ArticleInfoVo vo) {
        return mapper.getReportArticleBy(vo);
    }

    @Override
    public Boolean updateReportArticleData(ArticleInfoVo vo) {
        int i = mapper.updateReportArticleData(vo);

        return i>0;
    }
}
