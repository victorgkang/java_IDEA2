package com.hangzhou.guokang.day4;

/**
 * @Description: 小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,
 * 0.9%,-4.5%,5.5%。请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？打印效果如下：
 * @Author: victor
 * @Date: 2020/9/3  20:32
 */
public class Homework7 {
    public static void main(String[] args) {
        double[] array = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};

        int profitCount = 0;
        int lossCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                lossCount++;
            } else {
                profitCount++;
            }
        }
        System.out.println("亏损的股票数为：" + lossCount);
        System.out.println("盈利的股票数为：" + profitCount);
    }
}
