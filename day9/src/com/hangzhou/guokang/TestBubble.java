package com.hangzhou.guokang;

/**
 * @Description: 冒泡排序
 * @Author: victor
 * @Date: 2020/9/8  20:20
 */
public class TestBubble {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int c = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = c;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");

        }
        System.out.println();

    }
}
