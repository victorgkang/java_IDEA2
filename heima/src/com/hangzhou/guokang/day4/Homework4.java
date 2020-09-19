package com.hangzhou.guokang.day4;

import java.util.Random;

/**
 * @Description: 有一个整数数组。请编写代码，让数组的最后一个元素代表个位，倒数第二个元素代表十位，以此类推。最终得到一个大的整数。
 * @Author: victor
 * @Date: 2020/9/3  19:42
 */
public class Homework4 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array =new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i]=ran.nextInt(10);
            System.out.print(array[i]+"\t");
        }
        int digit=0;
        for (int i = 0; i < array.length; i++) {
            digit=digit*10+array[i];
        }
        System.out.println(digit);

    }
}
