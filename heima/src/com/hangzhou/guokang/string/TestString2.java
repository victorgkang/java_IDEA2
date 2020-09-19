package com.hangzhou.guokang.string;

import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/3  14:45
 */
public class TestString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = input.nextInt();
        String str2 =Integer.toString(number);
        String str=String.valueOf(number);
       for (int i = 0; i < str2.length(); i++) {
           System.out.println(str2.charAt(i));
        }


    }


}
