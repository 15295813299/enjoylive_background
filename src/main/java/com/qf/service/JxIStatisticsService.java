package com.qf.service;

import java.util.Date;
import java.util.List;

/**
 * @author Sin
 * @date 2019/4/24/16:25
 */
public interface JxIStatisticsService {
    List<Integer> getBrowseCountByTimeRank(Date date);

    List<Integer> getCommentCountByTimeRank(Date date);

    List<Integer> getSupportCountByTimeRank(Date date);

    List<String> getDateName(Date date);
}
