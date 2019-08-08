package com.m.businesslib.organization.entity;

import org.apache.ibatis.type.Alias;

/**
 * 组织权限
 */
@Alias("OrganizationLimitEntity")
public class OrganizationLimitEntity {
    //组织id
    int organizationId;
    //权限id
    int limitId;

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public int getLimitId() {
        return limitId;
    }

    public void setLimitId(int limitId) {
        this.limitId = limitId;
    }
}
