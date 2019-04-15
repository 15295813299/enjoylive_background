package com.qf.mapper;

import com.qf.pojo.UserInfo;
import com.qf.vo.LoginCheckVo;

public interface UserInfoMapper {
    UserInfo LoginCheckRole(LoginCheckVo loginCheckVo);
}
