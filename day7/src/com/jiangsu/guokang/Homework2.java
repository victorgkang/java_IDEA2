package com.jiangsu.guokang;

/**
 * @Description: 寻找1000以内的亲密数，A的所有因子之和为B，并且B的所有因子之和为A，则，这两个数为亲密数；
 * @Author: victor
 * @Date: 2020/8/31  20:54
 */
public class Homework2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if (factor(i) == j && factor(j) == i) {
                    System.out.println("这两个亲密数为：" + i + "\t" + j);

                }
            }
        }

    }

    public static int factor(int n) {             //所有n的因子之和（不包括1和它本身）
        int sum = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }


}
