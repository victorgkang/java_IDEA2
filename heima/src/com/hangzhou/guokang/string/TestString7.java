package com.hangzhou.guokang.string;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/3  17:01
 */
public class TestString7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("红色").append("蓝色").append("绿色");

        System.out.println("反转前：" + sb);
        sb.reverse();
        System.out.println("反转后：" + sb);

        System.out.println("sb中字符的个数为：" + sb.length());

        String s = sb.toString();
        System.out.println(s);

    }
}
