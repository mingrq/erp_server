package com.m.businesslib.role.entity;

import org.apache.ibatis.type.Alias;

/**
 * 角色权限
 */
@Alias("RoleLimitEntity")
public class RoleLimitEntity {
    //角色id
    int roleId;
    //权限id
    int limitId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getLimitId() {
        return limitId;
    }

    public void setLimitId(int limitId) {
        this.limitId = limitId;
    }
}
