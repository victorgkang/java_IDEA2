package com.hangzhou.victor;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/22  21:48
 */
public class TestInterface {
    public static void main(String[] args) {
        B b = new B();
        b.method1();
        b.method2();
    }
}


interface IA{
    void method1();
    void method2();
}

abstract class A implements IA{    //如何不覆盖接口的方法，则该类还是抽象类
    public void method1(){

    }
}

class B extends A{               //继承父类
    public void method2(){

    }
}