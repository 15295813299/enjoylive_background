package com.qf.pojo;

/**
 * 管理员信息表
 */
public class RoleInfo {

  //自增id
  private long roleId;
  //管理员名字
  private String roleName;
  //管理员描述
  private String roleDescribe;
  //状态
  private String flag;


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public String getRoleDescribe() {
    return roleDescribe;
  }

  public void setRoleDescribe(String roleDescribe) {
    this.roleDescribe = roleDescribe;
  }

  @Override
  public String toString() {
    return "RoleInfo{" +
            "roleId=" + roleId +
            ", roleName='" + roleName + '\'' +
            ", roleDescribe='" + roleDescribe + '\'' +
            ", flag='" + flag + '\'' +
            '}';
  }
}
