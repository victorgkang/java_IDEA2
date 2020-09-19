package com.hangzhou.guokang;

/**
 * @Description: 二维数组
 * @Author: victor
 * @Date: 2020/9/8  22:20
 */
public class Test2DArray {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        array[0][0] = 10;
        array[1][2] = 20;
        array[2][4] = 30;
        array[1][3] = 40;
        array[0][2] = 50;
        array[0][4] = 60;
        System.out.println(array.length);   //这是打印高纬数组的值
        System.out.println(array[0].length);  //这是打印低维数组的值
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
