package com.hangzhou.guokang;

/**
 * @Description: 选择排序，外层循环控制固定值，内层循环控制固定值与其他值比较大小。
 * @Author: victor
 * @Date: 2020/9/8  21:02
 */
public class TestSelect {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};
        for (int i = 0; i < array.length-1; i++) {
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int c=array[i];
                    array[i]=array[j];
                    array[j]=c;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");

        }
        System.out.println();
    }
}
