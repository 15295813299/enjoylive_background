package com.qf.service.impl;

import com.qf.dto.RoleInfoDto;
import com.qf.dto.UserInfoDto;
import com.qf.mapper.RoleInfoMapper;
import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.RoleInfo;
import com.qf.service.RoleInfoService;
import com.qf.tools.Md5Utils;
import com.qf.vo.RoleInfoVo;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    RoleInfoMapper roleInfoMapper;

    @Autowired
    UserInfoMapper userInfoMapper;


    public Boolean addRoleInfo(RoleInfo roleInfo) {
        int addLength = roleInfoMapper.addRoleInfo(roleInfo);
        if (addLength>0){
            return true;
        }
        return false;
    }

    public List<UserInfoDto> getUserRoleInfoAll(RoleInfoVo roleInfoVo) {
        return roleInfoMapper.getUserRoleInfoAll(roleInfoVo);
    }

    public List<RoleInfoDto> getRoleInfoAll(RoleInfoVo roleInfoVo) {
        return roleInfoMapper.getRoleInfoAll(roleInfoVo);
    }

    public Boolean delRoleInfo(String[] array) {
        Integer info = roleInfoMapper.delRoleInfo(array);
        if (info>0){
            return true;
        }
        return false;
    }

    /**
     * 获取某个管理员有的权限，以及未获得的权限
     */
    public List<UserInfoDto> getUserRoleInfoBy(UserInfoVo vo){
        return roleInfoMapper.getUserRoleInfoBy(vo);
    }

    @Transactional
    public Boolean updateUserRole(UserInfoVo vo){
        //判断密码是否更改,更改则加密
        if (vo.getPassword().length()<24) {
            String password = vo.getPassword();
            for (int i = 0; i < 3; i++) {
                password = Md5Utils.encodePassword(password+password);
            }
            vo.setPassword(password);
        }
        //修改用户信息
        userInfoMapper.updateUserInfoById(vo);
        //删除用户所有权限
        roleInfoMapper.updateUserRole(vo);
        //如果为空则不添加权限
        if (vo.getRoleInfoVo().isEmpty()) {
            return true;
        }
        //不为空添加新权限
        int i1 = roleInfoMapper.addUserRole(vo);
        if (i1>0)
            return true;
        return false;
    }

    public Boolean userRoleForbidden(UserInfoVo vo) {
        int i = roleInfoMapper.updateUserRole(vo);
        if (i>0){
            return true;
        }
        return false;
    }
}
