package com.hangzhou.victor.pm;

/**
 * @Description:       构造方法的使用
 * @Author: victor
 * @Date: 2020/9/10  21:40
 */
public class TestConstructors {
    public static void main(String[] args) {
        student st1 = new student();              //构造方法的引用只能new一个，不能用.来引用
        st1.sayHello();
        System.out.println(st1);
    }
}

class student {
    String name;
    int age;
    char sex;
    double score;
    public student(){                             //这是一个构造方法，主要用来构造对象的，如果类中没有显示构造方法，
                                                   //系统默认一个无参构造方法。
        System.out.println("student()   executed...");
    }

    public void sayHello(){
        System.out.println("Hello Everyone");
    }
}