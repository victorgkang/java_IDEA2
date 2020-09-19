package com.hangzhou.guokang.string;

import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/3  14:51
 */
public class TestString3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = input.nextLine();
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);

        }

    }
}
