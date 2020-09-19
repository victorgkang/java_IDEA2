package com.hangzhou.guokang;

/**
 * @Description: 冒泡排序 (排升序)
 * @Author: victor
 * @Date: 2020/9/9  17:28
 */
public class TestBubble2 {
    public static void main(String[] args) {
        int[] array = {1, 25, 485, 2, 35, 14, 12, 36, 100, 20};

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int mid = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = mid;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }


    }
}
