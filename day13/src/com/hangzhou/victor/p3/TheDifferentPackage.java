package com.hangzhou.victor.p3;

import com.hangzhou.victor.p2.Target;

/**
 * @Description:  非同包只能访问到public修饰的属性，但是如果是某个类的子类，则可以访问到父类中protected修饰的属性,
 * 只能用this.来访问。
 * @Author: victor
 * @Date: 2020/9/15  18:05
 */
public class TheDifferentPackage extends Target{



    public static void main(String[] args) {
        Target target = new Target();

        System.out.println(target.d);
        System.out.println(target.d);
        System.out.println();


    }
    public void access(){
        System.out.println(this.c);
    }

}
