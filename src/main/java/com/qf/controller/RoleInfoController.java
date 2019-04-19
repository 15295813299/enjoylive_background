package com.qf.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.RoleInfoDto;
import com.qf.dto.UserInfoDto;
import com.qf.pojo.RoleInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.RoleInfoService;
import com.qf.vo.RoleInfoVo;
import com.qf.vo.UserInfoVo;
import com.qf.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 管理员控制器
 */
@RestController
public class RoleInfoController {

    @Autowired
    RoleInfoService service;

    /**
     * 添加管理员类型
     * @param roleInfo
     * @return
     */
    @RequestMapping(value = "bgAddRoleInfo",method = RequestMethod.POST)
    public Boolean addRoleInfo(@RequestBody(required = false) RoleInfo roleInfo){
        System.out.println(roleInfo);
        Boolean info = service.addRoleInfo(roleInfo);
        return info;

    }

    /**
     * 获取所有管理员账号
     * @param roleInfoVo
     * @return
     */
    @RequestMapping(value = "getUserRoleInfoAll",method = RequestMethod.POST)
    public Object getUserRoleInfoAll(@RequestBody(required = false)  RoleInfoVo roleInfoVo){
        PageHelper.startPage(roleInfoVo.getCurrentPage(),roleInfoVo.getPageSize());
        List<UserInfoDto> infoAll = service.getUserRoleInfoAll(roleInfoVo);
        PageInfo info = new PageInfo(infoAll);
        return info;
    }

    /**
     * 获取所有管理员类别
     * @param roleInfoVo
     * @return
     */

    @RequestMapping(value = "getRoleInfoAll",method = RequestMethod.POST)
    public Object getRoleInfoAll(@RequestBody(required = false)  RoleInfoVo roleInfoVo){
        PageHelper.startPage(roleInfoVo.getCurrentPage(), roleInfoVo.getPageSize());
        List<RoleInfoDto> roleInfoAll = service.getRoleInfoAll(roleInfoVo);
        PageInfo info = new PageInfo(roleInfoAll);

        return info;
    }

    /**
     * 删除管理员类别
     * @param array
     * @return
     */
    @RequestMapping(value = "delRoleInfo",method = RequestMethod.POST)
    public Boolean delRoleInfo(String[] array){

        return service.delUserRole(array);
    }

    /**
     * 获取某个管理员有的权限，以及未获得的权限
     */
    @RequestMapping(value = "getUserRoleInfoBy",method = RequestMethod.POST)
    public List<UserInfoDto> getUserRoleInfoBy(@RequestBody UserInfoVo vo){
        return service.getUserRoleInfoBy(vo);
    }

    @RequestMapping(value = "updateUserRole",method = RequestMethod.POST)
    public Boolean updateUserRole(@RequestBody UserInfoVo vo){

        vo.setFlag(0);
        return service.updateUserRole(vo);
//        return false;
    }

    /**
     * 修改用户管理员的状态，禁用
     * @param vo
     * @return
     */
    @RequestMapping(value = "userRoleForbidden",method = RequestMethod.POST)
    public Boolean userRoleForbidden(@RequestBody UserInfoVo vo){
        System.out.println(vo);
        return service.userRoleForbidden(vo);
    }

    /**
     * 修改角色状态
     * @param roleInfoVo
     * @return
     */
    @RequestMapping(value = "updateRoleInfoFlagById",method = RequestMethod.POST)
    public Boolean updateRoleInfoFlagById(@RequestBody RoleInfoVo roleInfoVo) {

        return service.updateRoleInfoFlagById(roleInfoVo);
    }

}
