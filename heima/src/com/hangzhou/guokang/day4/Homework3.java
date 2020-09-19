package com.hangzhou.guokang.day4;

import java.util.Random;

/**
 * @Description: 创建一个长度为6的整数数组。请编写代码，随机生成六个0-100之间的整数存放到数组中，然后再计算出数组中元素的和并打印。
 * @Author: victor
 * @Date: 2020/9/3  19:32
 */
public class Homework3 {
    public static void main(String[] args) {
        Random ran=new Random();
        int[] array = new int[6];
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            array[i]=ran.nextInt(101);
            System.out.println("第"+(i+1)+"个随机数的值为"+array[i]);
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
