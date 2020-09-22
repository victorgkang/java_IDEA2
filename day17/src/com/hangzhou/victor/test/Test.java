package com.hangzhou.victor.test;

/**
 * @Description: 当调用类中的方法，或创建一个对象的时候，此时类开始加载，从头向下加载静态属性
 * @Author: victor
 * @Date: 2020/9/21  20:23
 */
class SingleTon {
    private static SingleTon singleTon = new SingleTon();
    public static int count1;
    public static int count2 = 0;

    private SingleTon() {
        count1++;
        count2++;
    }

    public static SingleTon getInstance() {
        return singleTon;
    }
}

public class Test {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        System.out.println("count1=" + singleTon.count1);
        System.out.println("count2=" + singleTon.count2);
    }
}
