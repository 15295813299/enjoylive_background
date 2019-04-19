package com.qf.controller;

import com.qf.dto.DataStatisticsDto;
import com.qf.service.DataStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataStatisticsController {

    @Autowired
    DataStatisticsService service;

    @RequestMapping(value = "getCount",method = RequestMethod.GET)
    public Object getCount(){
        return service.getCount();
    }

}
