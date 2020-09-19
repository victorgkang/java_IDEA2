package com.jiangsu.guokang;

import java.util.Arrays;

/**
 * @Description: 数组的复制
 * @Author: victor
 * @Date: 2020/9/1  11:36
 */
public class TestCopyArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 11;
        array[1] = 22;
        array[2] = 33;
        array[3] = 44;
        array[4] = 55;

        //第一种数组的复制
        int[] array2 = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }

        //第二种数组的复制
        System.out.println();
        int[] arrary3 = new int[array.length * 2];
        System.arraycopy(array, 0, arrary3, 0, array.length);
        for (int i = 0; i < arrary3.length; i++) {
            System.out.print(arrary3[i] + "\t");
        }
        System.out.println();

        //第三种数组的复制
        int[] array4 = Arrays.copyOf(array, array.length * 2);
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + "\t");
        }


    }
}
