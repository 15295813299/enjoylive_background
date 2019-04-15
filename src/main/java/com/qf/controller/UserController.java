package com.qf.controller;

import com.qf.service.UserInfoService;
import com.qf.tools.Md5Utils;
import com.qf.vo.LoginCheckVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制层
 */
@RestController
public class UserController {

    @Autowired
    UserInfoService service;

    /**
     * 管理员登录验证
     * @param loginCheckVo
     * @return
     */
    @RequestMapping(value = "bgLoginCheck",method = RequestMethod.POST)
    public Boolean LoginCheck(@RequestBody LoginCheckVo loginCheckVo){
        String password = loginCheckVo.getPassword();
        for (int i = 0; i < 3; i++) {
            password = Md5Utils.encodePassword(password+password);
        }
        loginCheckVo.setPassword(password);
        return service.LoginCheckRole(loginCheckVo);
    }
}
