package com.onlineclass.util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {

    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    private static String salt = "1a2b3c4e";

    public static String doInputPassword(String inputPwd) {
        String str = salt.charAt(1) + salt.charAt(0) + inputPwd + salt.charAt(4) + salt.charAt(2);
        return md5(str);
    }

    public static String setDBPwd(String pwd, String salt) {
        String str = salt.charAt(1) + salt.charAt(0) + pwd + salt.charAt(4) + salt.charAt(2);
        return md5(str);
    }

    public static String twoMd5Pwd(String inputPwd, String salt) {
        String str = doInputPassword(inputPwd);
        return setDBPwd(str, salt);
    }

    public static void main(String[] args) {

        System.out.println(twoMd5Pwd("123456", "5a4d3el7"));

    }


}
