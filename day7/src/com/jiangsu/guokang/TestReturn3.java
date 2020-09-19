package com.jiangsu.guokang;

import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/8/31  19:49
 */
public class TestReturn3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入hello的个数：");
        int n=input.nextInt();
        hello(n);
    }

    public static void hello(int n){
        for (int i = 1; i <=n; i++) {
            System.out.println("Hello\t"+i);
        }
    }
}
