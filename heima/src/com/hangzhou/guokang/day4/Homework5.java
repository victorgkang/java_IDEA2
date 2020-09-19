package com.hangzhou.guokang.day4;

/**
 * @Description: 定义一个数组来存储10个学生的成绩{72,89,65,87,91,82,71,93,76,68}，计算并输出学生的平均成绩。
 * @Author: victor
 * @Date: 2020/9/3  19:49
 */
public class Homework5 {
    public static void main(String[] args) {
        int[] array = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        double average ;
        double sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        average=sum/array.length;
        System.out.println("这十个同学的总成绩为："+sum);
        System.out.println("这十个同学的平均成绩为："+average);
    }
}
