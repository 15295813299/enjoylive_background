package com.qf.service.impl;

import com.qf.mapper.JxStatisticsMapper;
import com.qf.service.JxIStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Sin
 * @date 2019/4/24/16:26
 */
@Service
public class JxStatisticsServiceImpl implements JxIStatisticsService {
    private final JxStatisticsMapper jxStatisticsMapper;

    @Autowired
    public JxStatisticsServiceImpl(JxStatisticsMapper jxStatisticsMapper) {
        this.jxStatisticsMapper = jxStatisticsMapper;
    }

    @Override
    public List<Integer> getBrowseCountByTimeRank(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int n = 7;
        List<Integer> integerList = new ArrayList();
        Timestamp[] timestamps = new Timestamp[n + 1];
        timestamps[0] = new Timestamp(date.getTime());
        for (int i = 1; i < n + 1; i++) {
            calendar.add(Calendar.DATE, -1);
            timestamps[i] = new Timestamp(calendar.getTime().getTime());
            HashMap<String, Object> hashMap = new HashMap();
            hashMap.put("endDate", timestamps[i - 1]);
            hashMap.put("startDate", timestamps[i]);
            Integer integer = jxStatisticsMapper.getBrowseCountByTimeRank(hashMap);
            integerList.add(integer);
        }
        return integerList;
    }

    @Override
    public List<Integer> getCommentCountByTimeRank(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int n = 7;
        List<Integer> integerList = new ArrayList();
        Timestamp[] timestamps = new Timestamp[n + 1];
        timestamps[0] = new Timestamp(date.getTime());
        for (int i = 1; i < n + 1; i++) {
            calendar.add(Calendar.DATE, -1);
            timestamps[i] = new Timestamp(calendar.getTime().getTime());
            HashMap<String, Object> hashMap = new HashMap();
            hashMap.put("endDate", timestamps[i - 1]);
            hashMap.put("startDate", timestamps[i]);
            Integer integer = jxStatisticsMapper.getCommentCountByTimeRank(hashMap);
            integerList.add(integer);
        }
        return integerList;
    }

    @Override
    public List<Integer> getSupportCountByTimeRank(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int n = 7;
        List<Integer> integerList = new ArrayList();
        Timestamp[] timestamps = new Timestamp[n + 1];
        timestamps[0] = new Timestamp(date.getTime());
        for (int i = 1; i < n + 1; i++) {
            calendar.add(Calendar.DATE, -1);
            timestamps[i] = new Timestamp(calendar.getTime().getTime());
            HashMap<String, Object> hashMap = new HashMap();
            hashMap.put("endDate", timestamps[i - 1]);
            hashMap.put("startDate", timestamps[i]);
            Integer integer = jxStatisticsMapper.getSupportCountByTimeRank(hashMap);
            integerList.add(integer);
        }
        return integerList;
    }

    @Override
    public List<String> getDateName(Date date) {
        DateFormat format = new SimpleDateFormat("M.d");
        List<String> stringList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int n = 7;
        for (int i = 1; i < n + 1; i++) {
            calendar.add(Calendar.DATE, -1);
            stringList.add(format.format(calendar.getTime()));
        }
        return stringList;
    }
}
