package com.jiangsu.guokang;

import java.util.Scanner;

/**
 * @Description: 输入一个几位数，并逐次打印每个数字。
 * @Author: victor
 * @Date: 2020/9/1  19:02
 */
public class PrintEveryNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = input.nextInt();
        int b = n, d = 1, c = 1;
        while (b > 0) {
            b = b / 10;
            c = c * 10;

        }
        for (int i = c; i >= 10; i = i / 10) {
            System.out.println("打印第" + d + "个数" + (n % i / (i / 10)));
            System.out.println(i);
            System.out.println(n % i);
            System.out.println(i / 10);

            d++;
        }
    }
}
