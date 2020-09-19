package com.hangzhou.guokang.string;

import java.util.Scanner;

/**
 * @Description:  替换敏感词
 * @Author: victor
 * @Date: 2020/9/3  15:53
 */
public class TestString6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入：");
        String str = input.nextLine();
        String newStr = str.replace("TMD", "***");
        System.out.println(newStr);

    }
}
