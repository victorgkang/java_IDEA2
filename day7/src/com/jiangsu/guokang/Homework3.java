package com.jiangsu.guokang;

import java.util.Scanner;

/**
 * @Description: 验证哥德巴赫猜想：任何一个大于6个偶数都可分解为两个质数相加
 * @Author: victor
 * @Date: 2020/8/31  21:08
 */
public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("请输入一个大于6的偶数：");             //输入一个偶数，若非偶数，循环输入
            n = input.nextInt();
        } while (n % 2 == 1 || n < 6);
        for (int i = 2; i <= n / 2; i++) {                       //只要验证n分解的两个数是质数就OK了；是不是很简单^_^。
            if (prime(i) && prime(n - i)) {                 //只要验证n分解的两个数是质数就OK了；是不是很简单^_^。
                System.out.println(n + "=" + i + "+" + (n - i));
            }
        }

    }

    public static boolean prime(int n) {              //验证这个值是不是质数，返回一个布尔值

        int sum = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == 0) {
            return true;
        } else {
            return false;
        }
    }


}
