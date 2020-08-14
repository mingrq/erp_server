package com.factory.erp.common.common.utils;

import java.security.MessageDigest;

public class StringUtils {
    public static String md5(String str) {
        if (str == null) {
            return null;
        } else {
            byte[] newByte1 = str.getBytes();
            try {
                MessageDigest e = MessageDigest.getInstance("MD5");
                byte[] newByte2 = e.digest(newByte1);
                String cryptograph = "";
                for (int i = 0; i < newByte2.length; ++i) {
                    String temp = Integer.toHexString(newByte2[i] & 255);
                    if (temp.length() < 2) {
                        temp = "0" + temp;
                    }
                    cryptograph = cryptograph + temp;
                }
                return cryptograph;
            } catch (Exception var7) {
                var7.printStackTrace();
                return null;
            }
        }
    }

    /**
     * 判断字符串是否是整数
     *
     * @param str
     * @return
     */
    public static boolean isNumber(String str) {
        if (str != null && !"".equals(str.trim())) {
            boolean flag = false;
            try {
                Long.parseLong(str);
                flag = true;
            } catch (Exception var3) {
                flag = false;
            }
            return flag;
        } else {
            return false;
        }
    }

    /**
     * 判断字符串是否是空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return null == str || str.trim().length() == 0;
    }

    /**
     * 断字符串是否 不为空
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
