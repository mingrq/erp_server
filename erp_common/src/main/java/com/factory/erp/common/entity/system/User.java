package com.factory.erp.common.entity.system;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    // 用户ID
    private int userId;
    // 用户的登录名
    private String userLoginName;
    // 用户的登录密码
    private String userLoginPwd;
    // 用户姓名
    private String userName;
    // 性别 0：女  1男
    private int userSex;
    // 用户身份证号
    private String userNumber;
    // 用户电话号码
    private String userPhone;
    // 用户手机号码
    private String userMobile;
    // 用户住址
    private String userSite;
    // 用户银行卡号
    private String userBank;
    // 用户邮箱
    private String userEmail;
    // 用户创建时间 入职时间
    private Date userGenTime;
    // 头像地址
    private String userPortrait;
    // 用户状态：0：在职  1：离职
    private int userState;
    // 用户离职时间
    private Date userLeaveTime;
    // 账号状态：-1：冻结不可用 0：正常
    private int identificationState;
    // 用户所在组织id
    private int userOrganization;

}
