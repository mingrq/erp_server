package com.m.commonlib.exceptions;

/**
 * sql添加数据失败错误
 */
public class SqlAddDataFailureException extends Exception {


    public enum FailureCause {
        //不存在的
        INEXISTENCE,

    }
}
