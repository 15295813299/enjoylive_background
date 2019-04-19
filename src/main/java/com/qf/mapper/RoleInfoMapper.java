package com.qf.mapper;


import com.qf.dto.RoleInfoDto;
import com.qf.dto.UserInfoDto;
import com.qf.pojo.RoleInfo;
import com.qf.pojo.UserRole;
import com.qf.vo.RoleInfoVo;
import com.qf.vo.UserInfoVo;
import com.qf.vo.UserRoleVo;

import java.util.List;

public interface RoleInfoMapper {
    /**
     * 添加管理员
     * @param roleInfo  传入一个管理员对象
     * @return  返回影响行数
     */
    int addRoleInfo(RoleInfo roleInfo);

    /**
     * 获取所有管理员用户
     * @return
     */
    List<UserInfoDto> getUserRoleInfoAll(RoleInfoVo roleInfoVo);

    /**
     * 获取所有管理员类型
     * @return
     */
    List<RoleInfoDto> getRoleInfoAll(RoleInfoVo roleInfoVo);

    /**
     * 批量删除或单删除
     * @param array
     * @return
     */
    Integer delRoleInfo(String[] array);

    /**
     * 获取某个管理员有的权限，以及未获得的权限
     */
    List<UserInfoDto> getUserRoleInfoBy(UserInfoVo vo);

    /**
     * 查询该用户所有权限，查到就删除
     * @param vo
     */
    int updateUserRole(UserInfoVo vo);

    /**
     * 添加用户管理员中间表，一次性添加
     * @param vo
     * @return
     */
    int addUserRole(UserInfoVo vo);
}
