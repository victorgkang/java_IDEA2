package com.jiangsu.guokang;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/1  21:20
 */
public class Test {
    public static void main(String[] args) {
        int[] array= new int[10];
        array[2]=10;
        System.out.println(array);
        int[] array2=array;
        System.out.println(array2);
        System.out.println(array2[2]);

        String[] str=new String[10];
        str[2]="abc";
        System.out.println(str);
        System.out.println(str[2]);

    }
}
