package com.qf.service.impl;

import com.qf.dto.DataStatisticsDto;
import com.qf.mapper.DataStatisticsMapper;
import com.qf.service.DataStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataStatisticsServiceImpl implements DataStatisticsService {

    @Autowired
    DataStatisticsMapper mapper;

    public DataStatisticsDto getCount() {
        DataStatisticsDto dto = new DataStatisticsDto();
        dto.setArticleCount(mapper.getArticleCount());
        dto.setUserCount(mapper.getUserCount());
        dto.setCommentCount(mapper.getCommentCount());
        dto.setBrowseCount(mapper.getBrowseCount());
        dto.setSupportCount(mapper.getSupportCount());
        dto.setLoginCount(mapper.getLoginCount());
        return dto;
    }
}
