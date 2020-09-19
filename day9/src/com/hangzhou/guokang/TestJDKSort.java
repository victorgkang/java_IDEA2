package com.hangzhou.guokang;

import java.util.Arrays;

/**
 * @Description:   数组排序(运用JDK的排序只能默认为升序，如果想要倒序，要进行头尾的互换)
 * @Author: victor
 * @Date: 2020/9/8  21:58
 */
public class TestJDKSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};
        Arrays.sort(array);
        //这个只能进行升序排列
        for (int i = 0; i < array.length/2; i++) {           //进行数值的调换，头尾调换
            int mid=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=mid;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
