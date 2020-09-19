package com.jiangsu.guokang;

import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/8/31  19:07
 */
public class TestArrayAverage {
    public static void main(String[] args) {

//        double sum=0;
//        Scanner input = new Scanner(System.in);
//        for (int i = 1; i <= 4; i++) {
//            System.out.println("请输入第"+i+"位同学的成绩");
//            double score=input.nextDouble();
//            sum+=score;
//        }
//        double average =sum/4;
//        System.out.println(average);

        Scanner input = new Scanner(System.in);
        double sum = 0;
        double[] score = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("请输入第" + (i + 1) + "位同学的成绩");
            score[i] = input.nextDouble();
        }
        double max = 0;
        double min = 100;
        for (int i = 0; i < 4; i++) {
            if (score[i] >= max) {
                max = score[i];
            }
            if (score[i] <= min) {
                min = score[i];
            }
        }
        System.out.println("这些同学的最大值为" + max);
        System.out.println("这些同学的最小值为" + min);


    }
}
