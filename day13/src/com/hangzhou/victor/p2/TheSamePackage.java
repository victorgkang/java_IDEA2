package com.hangzhou.victor.p2;

/**
 * @Description: 同包的可以访问到除private其他所有的属性，default的边界就是在同包的可见，非同包不可见
 * @Author: victor
 * @Date: 2020/9/15  18:02
 */
public class TheSamePackage {
    public static void main(String[] args) {
        Target target = new Target();
        System.out.println(target.b);
        System.out.println(target.c);
        System.out.println(target.d);
    }
}
