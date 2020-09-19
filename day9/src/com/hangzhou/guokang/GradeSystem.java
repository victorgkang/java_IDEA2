package com.hangzhou.guokang;

import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/10  11:56
 */
public class GradeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        double grade = input.nextDouble();
        if (grade >= 0 && grade <= 59) {
            System.out.println();
        } else if (grade >= 60 && grade <= 70) {

        }
    }
}
