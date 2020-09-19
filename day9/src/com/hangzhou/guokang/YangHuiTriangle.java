package com.hangzhou.guokang;

import java.util.Scanner;

/**
 * @Description: (打印杨慧三角形)(通过创建不规则数组来完成)
 * @Author: victor
 * @Date: 2020/9/9  17:53
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
/*
                       1                               n=1
                   1        1                          n=2
               1        2        1                     n=3
           1        3        3       1                 n=4
       1        4       6        4        1            n=5
 */
        Scanner input = new Scanner(System.in);
        System.out.println("请输入杨辉三角的行数：");
        int n = input.nextInt();
        int[][] array = new int[n][];
        for (int i = 0; i < n; i++) {
            array[i] = new int[i+1];
        }
        for (int i = 0; i < n; i++) {
            array[i][0]=1;
            array[i][array[i].length-1]=1;
        }
        for (int i = 2; i < n ; i++) {
            for (int j = 1; j < array[i].length-1; j++) {
                array[i][j]=array[i-1][j-1]+array[i-1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            blank(n-i-1);                                  //前面要插入n-i-1个制表符
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t"+"\t");      //插入两个制表符，让上下两个数错开
            }
            System.out.println();
        }


    }
    public static void blank(int n){                          //打印n个制表符的方法
        for (int i = 0; i < n; i++) {
            System.out.print("\t");
        }
    }
}
