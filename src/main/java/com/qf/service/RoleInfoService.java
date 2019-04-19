package com.qf.service;




import com.qf.dto.RoleInfoDto;
import com.qf.dto.UserInfoDto;
import com.qf.pojo.RoleInfo;
import com.qf.vo.RoleInfoVo;
import com.qf.vo.UserInfoVo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 管理员信息接口
 */

public interface RoleInfoService{
    /**
     * 添加管理员
     * @param roleInfo
     * @return 返回布尔类型
     */
    Boolean addRoleInfo(RoleInfo roleInfo);

    /**
     * 获取所有管理员用户
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
    Boolean delRoleInfo(String[] array);

    /**
     * 获取某个管理员有的权限，以及未获得的权限
     */
    List<UserInfoDto> getUserRoleInfoBy(UserInfoVo vo);

    /**
     *  更新用户权限
     * @param vo
     * @return
     */
    Boolean updateUserRole(UserInfoVo vo);

    /**
     * 禁用该管理员权限但不删除
     * @param vo
     * @return
     */
    public Boolean userRoleForbidden(@RequestBody UserInfoVo vo);
}
