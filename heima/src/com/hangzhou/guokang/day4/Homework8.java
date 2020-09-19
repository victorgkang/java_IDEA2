package com.hangzhou.guokang.day4;

/**
 * @Description: 定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。
 * （可以创建其他数组，不必须在原数组中改变）
 * @Author: victor
 * @Date: 2020/9/3  20:42
 */
public class Homework8 {
    public static void main(String[] args) {
        int[] array = {0, 17, 12, 26, 34, 26, 27, 29, 56, 19, 1, 99};
        int[] newArray = new int[array.length];

        int oddIndex=0;
        int evenIndex=array.length-1;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1){
                newArray[oddIndex]=array[i];
                oddIndex++;
            }else {
                newArray[evenIndex]=array[i];
                evenIndex--;
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+",");
        }

    }
}
