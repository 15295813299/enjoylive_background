package com.qf.vo;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class LoginCheckVo implements Serializable {
    //账号
    @NotBlank
    private String username;
    //密码
    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginCheckVo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
