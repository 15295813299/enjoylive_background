package com.qf.dto;

public class LoginUserInfoDto {
    private long userInfoId;
    private String name;

    public long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LoginUserInfoDto{" +
                "userInfoId=" + userInfoId +
                ", name='" + name + '\'' +
                '}';
    }
}
