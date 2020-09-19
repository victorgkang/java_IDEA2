package com.hangzhou.guokang.day4;

import java.util.Scanner;

/**
 * @Description: 有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。
 * 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
 * @Author: victor
 * @Date: 2020/9/3  19:57
 */
public class Homework6 {
    public static void main(String[] args) {
        int[] array = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] array2 = new int[array.length + 1];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数数字：");
        int number = input.nextInt();
        int index = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= number) {
                index = i;
                break;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (i < index) {
                array2[i] = array[i];
            } else if (i == index) {
                array2[i] = number;
            } else {
                array2[i] = array[i - 1];
            }
            System.out.print(array2[i] + "\t");
        }
    }
}
