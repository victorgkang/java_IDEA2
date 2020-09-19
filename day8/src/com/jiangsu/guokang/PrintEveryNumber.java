package com.jiangsu.guokang;

import java.util.Scanner;

/**
 * @Description: 输入一个几位数，并逐次打印每个数字。
 * @Author: victor
 * @Date: 2020/9/1  17:14
 */
public class PrintEveryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int number = input.nextInt();
        int n = howManyDigits(number);
        for (int i = 1; i <= n; i++) {                                   //循环查找每个值
            int digit = digit(i, number);                                //输出第i位的值
            System.out.println("这个数第" + i + "个值为：" + digit);
        }
    }

    public static int howManyDigits(int number) {                    //判断这是一个几位数，返回位的数值。
        int howMany = 1;
        do {
            if (number / 10 != 0) {
                howMany++;
                number = number / 10;
            }

        } while (number / 10 != 0);
        return howMany;
    }

    public static int digit(int i, int number) {                        //输出这个数第i位的值
        int n = howManyDigits(number);
        int digit = number;
        if (i == n) {
            digit = number % 10;
        } else {
            for (int j = 1; j <= n - i; j++) {
                digit = digit / 10;
            }
        }
        digit = digit % 10;
        return digit;
    }


}
