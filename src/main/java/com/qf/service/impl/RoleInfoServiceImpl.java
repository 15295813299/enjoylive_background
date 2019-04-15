package com.qf.service.impl;

import com.qf.mapper.RoleInfoMapper;
import com.qf.pojo.RoleInfo;
import com.qf.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    RoleInfoMapper mapper;


    public Boolean addRoleInfo(RoleInfo roleInfo) {
        System.out.println("service");
        int addLength = mapper.addRoleInfo(roleInfo);
        if (addLength>0){
            return true;
        }
        System.out.println("放回了");
        return false;
    }
}
