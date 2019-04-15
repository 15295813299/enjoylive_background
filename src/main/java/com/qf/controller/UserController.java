package com.qf.controller;

import com.qf.service.UserInfoService;
import com.qf.vo.LoginCheckVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserInfoService service;

    @RequestMapping(value = "bgLoginCheck",method = RequestMethod.POST)
    public Boolean LoginCheck(@RequestBody LoginCheckVo loginCheckVo){
        return service.LoginCheckRole(loginCheckVo);
    }
}
