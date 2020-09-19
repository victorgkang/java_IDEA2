package com.hangzhou.guokang.day4;

/**
 * @Description: 现有一个小数数组{12.9,53.54,75.0,99.1,3.14}。请编写代码，找出数组中的最小值并打印。
 * @Author: victor
 * @Date: 2020/9/3  19:28
 */
public class Homework2 {
    public static void main(String[] args) {
        double[] array = {12.9, 53.54, 75.0, 99.1, 3.14};
        double min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("这个数组最小值为： " + min);
    }
}
