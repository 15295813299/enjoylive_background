package com.qf.service.impl;

import com.qf.dto.LoginUserInfoDto;
import com.qf.dto.UserInfoDto;
import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.pojo.UserRole;
import com.qf.service.UserInfoService;
import com.qf.vo.AdminAddVo;
import com.qf.vo.LoginCheckVo;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper mapper;

    public Boolean LoginCheckRole(LoginCheckVo loginCheckVo, HttpSession session) {
        UserInfo userInfo = mapper.LoginCheckRole(loginCheckVo);
        if (userInfo!=null){
            LoginUserInfoDto dto = new LoginUserInfoDto();
            dto.setUserInfoId(userInfo.getUserInfoId());
            dto.setName(userInfo.getName());
            session.setAttribute("userInfo",dto);
            return true;
        }
        return false;
    }

    public List<UserInfoDto> getUserInfoBy(UserInfoVo userInfoVo) {
        return mapper.getUserInfoBy(userInfoVo);
    }

    @Transactional
    public Boolean addUserRole(AdminAddVo vo) {
        Integer integer = mapper.addUser(vo);
        UserInfoVo vo1 = new UserInfoVo();
        vo1.setUsername(vo.getUsername());
        List<UserInfoDto> userInfo = mapper.getUserInfoBy(vo1);
        long id = userInfo.get(0).getUserInfoId();
        UserRole userRole = new UserRole();
        userRole.setUserInfoId(id);
        for (String s:vo.getRoleId()) {
            userRole.setRoleId(Integer.parseInt(s));
            mapper.addUserRole(userRole);
        }

        return true;
    }



}
