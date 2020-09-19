package com.jiangsu.guokang;

/**
 * @Description: 求一个三位数，该三位数字等于其每位数字的阶乘的和。
 * @Author: victor
 * @Date: 2020/8/31  19:54
 */
public class Homework {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (i == multi(i)) {
                System.out.println("这个三位数是：" + i);
            }
        }
    }

    public static int multi(int n) {
        int sum;
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        sum = factorial(a) + factorial(b) + factorial(c);
        return sum;
    }

    public static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }


}
