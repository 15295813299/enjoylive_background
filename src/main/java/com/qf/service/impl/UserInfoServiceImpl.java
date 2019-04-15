package com.qf.service.impl;

import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.vo.LoginCheckVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper mapper;

    public Boolean LoginCheckRole(LoginCheckVo loginCheckVo) {
        UserInfo userInfo = mapper.LoginCheckRole(loginCheckVo);
        if (userInfo!=null){
            return true;
        }
        return false;
    }
}
