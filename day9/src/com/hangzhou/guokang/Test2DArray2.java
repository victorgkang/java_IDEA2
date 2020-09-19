package com.hangzhou.guokang;

/**
 * @Description: 创建不规则数组
 * @Author: victor
 * @Date: 2020/9/9  17:21
 */
public class Test2DArray2 {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        array[0] = new int[3];
        array[1] = new int[4];
        array[2] = new int[5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
