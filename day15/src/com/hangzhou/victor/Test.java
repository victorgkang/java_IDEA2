package com.hangzhou.victor;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/17  22:21
 */
public class Test {
    public static void main(String[] args) {
        double i5 = 100;
        Double i1 = 100.0;
        Double i2 = 100.0;
        Double i3 = 200.0;
        Double i4 = 200.0;
        System.out.println(i1 == i2);   //false
        System.out.println(i3 == i4);   //false


        Long l1 = 128L;
        Long l2 = 128L;
        System.out.println(l1 == l2);   //false
        System.out.println(l1 == 128L);  //true
        Long l3 = 127L;
        Long l4 = 127L;
        System.out.println(l3 == l4);    //true
        System.out.println(l3 == 127L);  //true
    }
}
