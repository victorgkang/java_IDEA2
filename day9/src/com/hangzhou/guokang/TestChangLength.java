package com.hangzhou.guokang;

/**
 * @Description: 用可边长参数,可边长参数只能放在形参的后面，而且只能有一个可边长参数。
 * @Author: victor
 * @Date: 2020/9/8  19:02
 */
public class TestChangLength {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        print(array);
        print(11, 22, 33, 44, 55);
        System.out.println(array.length);
        array = extend(15, array);
        System.out.println(array.length);

        int[] array2=extend(15,10,20,30,40,50);
        print(array2);

    }

    public static void print(int... array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static int[] extend(int length, int... array) {        //返回一个新数组的地址
        int[] newArray = new int[length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
