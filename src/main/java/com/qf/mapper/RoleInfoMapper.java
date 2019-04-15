package com.qf.mapper;


import com.qf.pojo.RoleInfo;

public interface RoleInfoMapper {
    /**
     * 添加管理员
     * @param roleInfo  传入一个管理员对象
     * @return  返回影响行数
     */
    int addRoleInfo(RoleInfo roleInfo);
}
