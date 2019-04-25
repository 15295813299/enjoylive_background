package com.qf.controller;

import com.qf.service.JxIStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Sin
 * @date 2019/4/24/17:13
 */
@RestController
@RequestMapping("statistics")
public class JxStatisticsController {
    private final JxIStatisticsService jxIStatisticsService;

    @Autowired
    public JxStatisticsController(JxIStatisticsService jxIStatisticsService) {
        this.jxIStatisticsService = jxIStatisticsService;
    }

    @RequestMapping("getDatas")
    public Object getDatas() {
        HashMap<String, Object> hashMap = new HashMap();
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        date = calendar.getTime();
        List<String> stringList = jxIStatisticsService.getDateName(date);
        List<Integer> integerList = jxIStatisticsService.getSupportCountByTimeRank(date);
        List<Integer> integerList1 = jxIStatisticsService.getCommentCountByTimeRank(date);
        List<Integer> integerList2 = jxIStatisticsService.getBrowseCountByTimeRank(date);
        Collections.reverse(stringList);
        Collections.reverse(integerList);
        Collections.reverse(integerList1);
        Collections.reverse(integerList2);
        hashMap.put("dateName", stringList);
        hashMap.put("supportData", integerList);
        hashMap.put("commentData", integerList1);
        hashMap.put("browseData", integerList2);
        return hashMap;
    }
}
