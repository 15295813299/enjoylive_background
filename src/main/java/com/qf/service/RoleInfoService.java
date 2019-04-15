package com.qf.service;




import com.qf.pojo.RoleInfo;

import java.lang.reflect.InvocationHandler;

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
}
