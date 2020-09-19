package com.hangzhou.guokang.string;

import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/3  15:43
 */
public class TestString5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入你的手机号：");
        long number = input.nextLong();
        String strNumber = String.valueOf(number);
        String start = strNumber.substring(0,3);
        String end = strNumber.substring(7);
        System.out.println(start+"****\t"+end);

    }
}
