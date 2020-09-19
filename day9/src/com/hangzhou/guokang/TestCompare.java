package com.hangzhou.guokang;

import java.util.Arrays;

/**
 * @Description: 基本数据类型引用函数不能改变值，引用型数据类型变量储存的是地址，只要堆地址里面的值发生了改变，
 * 打印那个地址的数据就会发生改变。
 * @Author: victor
 * @Date: 2020/9/8  17:23
 */
public class TestCompare {
    public static void main(String[] args) {
        int a = 10;
        m1(a);
        System.out.println(a);

        int[] array = {10, 20, 30};
        m2(array);
        System.out.println(array[0] + "\t" + array[1] + "\t" + array[2] + "\t");

        int[] array2={11,22,33,44};
        m3(array2);
        System.out.println(array2[0] + "\t" + array2[1] + "\t" + array2[2] + "\t");

        int[] array3={1,2,3,4,5};
        array3=m4(array3);
        System.out.println(array3.length);


    }

    public static void m1(int a) {
        a = 100;
    }

    public static void m2(int[] array) {
        array[0] = 100;
    }
    public static void m3(int[] array){
        array= Arrays.copyOf(array,array.length*2);
    }
    public static int[] m4(int[] array){
        array=Arrays.copyOf(array,array.length*2);
        return array;
    }


}
