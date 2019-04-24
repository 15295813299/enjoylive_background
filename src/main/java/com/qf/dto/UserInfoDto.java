package com.qf.dto;


import java.util.List;

public class UserInfoDto {

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
  private String flag;
  private String status;
  private Integer pageSize=5;
  private Integer currentPage=1;
  private List<RoleInfoDto> roleInfoDto;
  private String roles;
  private String reportName;
  private String reportTime;

  public String getReportTime() {
    return reportTime;
  }

  public void setReportTime(String reportTime) {
    this.reportTime = reportTime;
  }

  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
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

  public String getStatus() {
    return status;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getFlag() {
    if ("2".equals(flag)){
      flag="layui-btn layui-btn-disabled";
      status="停用";
    }else {
      flag="layui-btn";
      status="启用";
    }
    return flag;
  }

  public List<RoleInfoDto> getRoleInfoDto() {
    if (roleInfoDto!=null){
      roles="";
      for (RoleInfoDto dto : roleInfoDto) {
        roles+=dto.getRoleName()+" ";
      }

    }



    return roleInfoDto;
  }

  public void setRoleInfoDto(List<RoleInfoDto> roleInfoDto) {
    this.roleInfoDto = roleInfoDto;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

}
