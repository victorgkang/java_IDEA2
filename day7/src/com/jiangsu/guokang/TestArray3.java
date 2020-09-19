package com.jiangsu.guokang;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/8/31  18:54
 */
public class TestArray3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;

        }
        System.out.println("输出的总和是：" + sum);

        int[] array2;
        array2 = new int[]{20, 30, 40, 50};
        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            sum2 = sum2 + array2[i];

        }
        int average = sum / array2.length;
        System.out.println("平均数是：" + average);
    }
}
