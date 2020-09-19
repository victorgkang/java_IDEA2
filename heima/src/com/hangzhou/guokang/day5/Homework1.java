package com.hangzhou.guokang.day5;

/**
 * @Description: 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
 * @Author: victor
 * @Date: 2020/9/3  21:12
 */
public class Homework1 {
    public static void main(String[] args) {
            double minDigit=min(0.25,1.2);
        System.out.println(minDigit);
    }
    public static double min(double a,double b){
        if(a<=b){
            return a;
        }else {
            return b;
        }
    }





}
