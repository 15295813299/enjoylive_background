package com.qf.mapper;

import com.qf.dto.UserInfoDto;
import com.qf.pojo.UserInfo;
import com.qf.pojo.UserRole;
import com.qf.vo.AdminAddVo;
import com.qf.vo.LoginCheckVo;
import com.qf.vo.UserInfoVo;

import java.util.List;

public interface UserInfoMapper {
    /**
     * 验证登录
     * @param loginCheckVo
     * @return
     */
    UserInfo LoginCheckRole(LoginCheckVo loginCheckVo);

    /**
     * 通过特定的条件获取用户集合
     * @param userInfoVo
     * @return
     */
    List<UserInfoDto> getUserInfoBy(UserInfoVo userInfoVo);

    /**
     * 添加用户（账号，密码，邮箱，电话）
     * @param adminAddVo
     * @return
     */
    Integer addUser(AdminAddVo adminAddVo);

    /**
     * 添加用户管理员中间表
     * @param userRole
     * @return
     */
    Integer addUserRole(UserRole userRole);

    /**
     * 根据id修改用户信息
     */
    int updateUserInfoById(UserInfoVo vo);
}
