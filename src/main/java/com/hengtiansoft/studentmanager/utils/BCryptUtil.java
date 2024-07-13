package com.hengtiansoft.studentmanager.utils;

import org.mindrot.jbcrypt.BCrypt;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/13 23:44
 * @Description:
 */
public class BCryptUtil {

    // 加密密码
    public static String encrypt(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // 验证密码
    public static boolean verify(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }
}

