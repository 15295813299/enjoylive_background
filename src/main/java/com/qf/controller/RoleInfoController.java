package com.qf.controller;


import com.qf.pojo.RoleInfo;
import com.qf.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员控制器
 */
@RestController
public class RoleInfoController {

    @Autowired
    RoleInfoService roleInfoService;

    @RequestMapping(value = "bgAddRoleInfo",method = RequestMethod.POST)
    public Boolean addRoleInfo(@RequestBody RoleInfo roleInfo){
            System.out.println(roleInfo);
        Boolean info = roleInfoService.addRoleInfo(roleInfo);
        return info;

    }
}
