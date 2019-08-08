package com.m.businesslib.user.entity;

import org.apache.ibatis.type.Alias;

/**
 * 用户权限
 */
@Alias("UserLimitEntity")
public class UserLimitEntity {
    //用户id
    int userId;
    //权限id
    int limitId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLimitId() {
        return limitId;
    }

    public void setLimitId(int limitId) {
        this.limitId = limitId;
    }
}
