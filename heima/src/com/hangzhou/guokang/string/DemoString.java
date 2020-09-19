package com.hangzhou.guokang.string;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/3  10:24
 */
public class DemoString {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println(s2);

        String s3 = new String("123");
        System.out.println(s3);

    }
}
