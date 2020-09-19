package com.hangzhou.guokang;

/**
 * @Description:  选择排序(升序)
 * @Author: victor
 * @Date: 2020/9/9  17:40
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {1, 25, 485, 2, 35, 14, 12, 36, 100, 20};

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    int mid =array[i];
                    array[i]=array[j];
                    array[j]=mid;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }










    }
}
