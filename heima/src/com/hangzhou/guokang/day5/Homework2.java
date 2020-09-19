package com.hangzhou.guokang.day5;

/**
 * @Description:  定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
 * @Author: victor
 * @Date: 2020/9/8  10:38
 */
public class Homework2 {
    public static void main(String[] args) {
        int max=getMax(40,20,30);
        System.out.println(max);
    }


    public static int getMax(int a, int b, int c) {
        if(a>=b){
            b=a;
        }
        if(b>=c){
            c=b;
        }
        return c;
    }
}
