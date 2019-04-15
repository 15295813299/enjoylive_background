package com.qf.service;

import com.qf.pojo.UserInfo;
import com.qf.vo.LoginCheckVo;

public interface UserInfoService {
    Boolean LoginCheckRole(LoginCheckVo loginCheckVo);
}
