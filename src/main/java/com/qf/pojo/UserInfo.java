package com.qf.pojo;

/**
 * 用户信息表
 */
public class UserInfo {
  //用户自增id
  private long userInfoId;
  //账号
  private String username;
  //密码
  private String password;
  //年龄
  private long age;
  //性别
  private String sex;
  //昵称
  private String name;
  //邮箱
  private String email;
  //手机号
  private String phone;
  //头像
  private String headPath;
  //国家
  private String country;
  //省份
  private String province;
  //城市
  private String city;
  //个人简介
  private long brief;
  //注册时间（自动生成）
  private java.sql.Timestamp registrationDate;
  //出生年份
  private String birthYear;
  //出生月份
  private String birthMonth;
  //具体出生年月日
  private java.sql.Date birthYmd;
  //状态（0为删除，1为启用，2为封号）
  private String flag;


  public long getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(long userInfoId) {
    this.userInfoId = userInfoId;
  }


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


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getHeadPath() {
    return headPath;
  }

  public void setHeadPath(String headPath) {
    this.headPath = headPath;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public long getBrief() {
    return brief;
  }

  public void setBrief(long brief) {
    this.brief = brief;
  }


  public java.sql.Timestamp getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(java.sql.Timestamp registrationDate) {
    this.registrationDate = registrationDate;
  }


  public String getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(String birthYear) {
    this.birthYear = birthYear;
  }


  public String getBirthMonth() {
    return birthMonth;
  }

  public void setBirthMonth(String birthMonth) {
    this.birthMonth = birthMonth;
  }


  public java.sql.Date getBirthYmd() {
    return birthYmd;
  }

  public void setBirthYmd(java.sql.Date birthYmd) {
    this.birthYmd = birthYmd;
  }


  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  @Override
  public String toString() {
    return "UserInfo{" +
            "userInfoId=" + userInfoId +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            ", headPath='" + headPath + '\'' +
            ", country='" + country + '\'' +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", brief=" + brief +
            ", registrationDate=" + registrationDate +
            ", birthYear='" + birthYear + '\'' +
            ", birthMonth='" + birthMonth + '\'' +
            ", birthYmd=" + birthYmd +
            ", flag='" + flag + '\'' +
            '}';
  }
}
