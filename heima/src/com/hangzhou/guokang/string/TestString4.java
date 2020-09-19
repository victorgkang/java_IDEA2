package com.hangzhou.guokang.string;

import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/3  15:09
 */
public class TestString4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = input.nextLine();
        int upperNumber=0;
        int downNumber=0;
        int number=0;
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='A'&&ch[i]<='Z') {
                upperNumber++;

            }else if (ch[i]>='a'&&ch[i]<='z'){
                downNumber++;
            }else if (ch[i]>='0'&&ch[i]<='9'){
                number++;
            }

        }

        System.out.println("大写字母的个数为："+upperNumber);
        System.out.println("小写字母的个数为："+downNumber);
        System.out.println("数字个数为："+number);

    }
}
