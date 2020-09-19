package com.hangzhou.victor;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/19  15:27
 */
public class TestAccessStaticMethod {
    public static void main(String[] args) {
        OtherClass.method1();
    }
}


class OtherClass{
    static int field1;
    int field2;

    public static void method1(){
        System.out.println(OtherClass.field1);
        System.out.println(field1);
//        System.out.println(field2);   静态方法不可以访问实例属性
    }

    public static void method2(){
        OtherClass.method1();
    }
}