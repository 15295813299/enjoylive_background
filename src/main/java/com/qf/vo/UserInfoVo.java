package com.qf.vo;


import java.util.List;

public class UserInfoVo {

  private long userInfoId;
  private String username;
  private String password;
  private long age;
  private String sex;
  private String name;
  private String email;
  private String phone;
  private String headPath;
  private String country;
  private String province;
  private String city;
  private String brief;
  private String registrationDate;
  private String birthYear;
  private String birthMonth;
  private String birthYMD;
  private int flag=-1;
  private int flagf=-1;
  private int pageSize=100;
  private int currentPage=1;
  private int[] userInfoIds;
  private List<RoleInfoVo> roleInfoVo;


  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public int getFlagf() {
    return flagf;
  }

  public void setFlagf(int flagf) {
    this.flagf = flagf;
  }

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


  public String getBrief() {
    return brief;
  }

  public void setBrief(String brief) {
    this.brief = brief;
  }


  public String getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(String registrationDate) {
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

  public String getBirthYMD() {
    return birthYMD;
  }

  public void setBirthYMD(String birthYMD) {
    this.birthYMD = birthYMD;
  }

  public int getFlag() {
    return flag;
  }

  public void setFlag(int flag) {
    this.flag = flag;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<RoleInfoVo> getRoleInfoVo() {
    return roleInfoVo;
  }

  public void setRoleInfoVo(List<RoleInfoVo> roleInfoVo) {
    this.roleInfoVo = roleInfoVo;
  }


  public int[] getUserInfoIds() {
    return userInfoIds;
  }

  public void setUserInfoIds(int[] userInfoIds) {
    this.userInfoIds = userInfoIds;
  }

  @Override
  public String toString() {
    return "UserInfoVo{" +
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
            ", registrationDate='" + registrationDate + '\'' +
            ", birthYear='" + birthYear + '\'' +
            ", birthMonth='" + birthMonth + '\'' +
            ", birthYMD='" + birthYMD + '\'' +
            ", flag='" + flag + '\'' +
            ", roleInfoVo=" + roleInfoVo +
            '}';
  }
}
