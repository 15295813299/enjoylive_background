package com.qf.service;

import com.qf.dto.UserInfoDto;
import com.qf.vo.UserInfoVo;

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
}
