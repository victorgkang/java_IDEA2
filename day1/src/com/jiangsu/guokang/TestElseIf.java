package com.jiangsu.guokang;

import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/11  9:07
 */
public class TestElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");

        } else if (score >= 70) {
            System.out.println("加油");
        } else {
            System.out.println("继续加油");
        }
    }
}
