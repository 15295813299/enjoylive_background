package com.qf.mapper;

import java.util.Map;

/**
 * @author Sin
 * @date 2019/4/24/16:24
 */
public interface JxStatisticsMapper {
    int getBrowseCountByTimeRank(Map map);

    int getCommentCountByTimeRank(Map map);

    int getSupportCountByTimeRank(Map map);
}
