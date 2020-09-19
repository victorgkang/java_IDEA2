package com.jiangsu.guokang;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/8/31  18:16
 */
public class TestArray2 {
    public static void main(String[] args) {
        int[] array1;           //定义数组类型的变量
        array1 = new int[4];     //为数组分配空间

        int[] array2 = new int[4];

        int[] array3 = new int[]{0, 1, 2, 3,};
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        int[] array4 = {4, 5, 6, 7};
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }


    }
}
