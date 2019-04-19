package com.qf.service;

import com.qf.dto.DataStatisticsDto;

public interface DataStatisticsService {
    //获取：文章总数、会员数、浏览数、当日活跃数
    DataStatisticsDto getCount();
}
