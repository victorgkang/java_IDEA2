package com.jiangsu.guokang;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/8/31  19:35
 */
public class TestReturn {
    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println("这两个数的总和为：" + sum);

    }

    public static int add(int a, int b) {
        return a + b;
    }
}
