package com.hangzhou.guokang;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/8  16:13
 */
public class TestParameters {
    public static void main(String[] args) {
        int[] array = new int[]{11, 22, 33, 44};
        int[] array2 = new int[]{55, 66, 77, 88, 99, 100, 110};
        print(array);
        print(array2);
    }


    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
