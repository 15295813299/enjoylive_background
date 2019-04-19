package com.qf.controller;

import com.qf.dto.UserInfoDto;
import com.qf.service.UserInfoService;
import com.qf.tools.Md5Utils;
import com.qf.vo.AdminAddVo;
import com.qf.vo.LoginCheckVo;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

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
    public Boolean LoginCheck(@RequestBody LoginCheckVo loginCheckVo, HttpSession session){
        String password = loginCheckVo.getPassword();
        for (int i = 0; i < 3; i++) {
            password = Md5Utils.encodePassword(password+password);
        }
        loginCheckVo.setPassword(password);
        return service.LoginCheckRole(loginCheckVo,session);
    }

    /**
     * 获取session里 的用户登录信息（管理员的id跟昵称）
     * @param session
     * @return
     */
    @RequestMapping(value = "getSessionLoginInfo",method = RequestMethod.GET)
    public Object getSessionLoginInfo(HttpSession session){

        return session.getAttribute("userInfo");
    }

    /**
     * 通过特定的条件获取用户集合
     * @param userInfoVo
     * @return
     */
    @RequestMapping(value = "getUserInfoBy",method = RequestMethod.POST)
    public Object getUserInfoBy(@RequestBody(required = false) UserInfoVo userInfoVo){
        return service.getUserInfoBy(userInfoVo);
    }


    /**
     * 添加用户以及添加用户管理员中间表（注册并添加为管理员）
     * @param vo
     * @return
     */

    @RequestMapping(value = "addUserRole",method = RequestMethod.POST)
    public Boolean addUserRole(@RequestBody AdminAddVo vo){
        String password=vo.getPassword();
        for (int i = 0; i < 3; i++) {
            password = Md5Utils.encodePassword(password+password);
        }
        vo.setPassword(password);
        return service.addUserRole(vo);
    }
}
