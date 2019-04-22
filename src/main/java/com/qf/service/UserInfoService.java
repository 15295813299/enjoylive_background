package com.qf.service;

import com.qf.dto.UserInfoDto;
import com.qf.pojo.UserInfo;
import com.qf.vo.AdminAddVo;
import com.qf.vo.LoginCheckVo;
import com.qf.vo.UserInfoVo;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserInfoService {
    Boolean LoginCheckRole(LoginCheckVo loginCheckVo, HttpSession session);
    /**
     * 通过特定的条件获取用户集合
     * @param userInfoVo
     * @return
     */
    List<UserInfoDto> getUserInfoBy(UserInfoVo userInfoVo);

    /**
     * 添加用户以及添加用户管理员中间表（注册并添加为管理员）
     * @param vo
     * @return
     */
    Boolean addUserRole(AdminAddVo vo);

    /**
     * 根据id修改用户信息
     */
    Boolean updateUserInfoById(UserInfoVo vo);
}
