package com.hangzhou.victor;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/18  16:24
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array= new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
