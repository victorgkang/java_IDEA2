package com.hangzhou.guokang.string;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/3  11:29
 */
public class TestString {
    public static void main(String[] args) {
        String s1="abc";
        String s2="ABC";
        String s3=new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s2));

    }
}
