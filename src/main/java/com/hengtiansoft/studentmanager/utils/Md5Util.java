package com.hengtiansoft.studentmanager.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/13 21:45
 * @Description:
 */


public class Md5Util {

    /**
     * 对一组字符串进行MD5加密，结果以16进制形式返回
     *
     * @param inputStrs 需要进行MD5加密的字符串数组
     * @return 经过MD5加密后的字符串
     */
    public static String md5(String... inputStrs) {
        try {
            // 将所有输入字符串按顺序拼接成一个字符串
            StringBuilder sb = new StringBuilder();
            for (String input : inputStrs) {
                sb.append(input);
            }
            // 获取MD5 MessageDigest实例
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 使用指定的字节数组对摘要进行更新，然后完成哈希计算
            byte[] messageDigest = md.digest(sb.toString().getBytes());
            // 将得到的字节数组转换为16进制表示
            return new BigInteger(1, messageDigest).toString(16);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("未能初始化MessageDigest实例", e);
        }
    }
}

