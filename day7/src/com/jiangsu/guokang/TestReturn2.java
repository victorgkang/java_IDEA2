package com.jiangsu.guokang;

import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/8/31  19:42
 */
public class TestReturn2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要叠加的值：");
        int n=input.nextInt();
        System.out.println(add(n));
    }


    public static int add(int n){
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }

}
