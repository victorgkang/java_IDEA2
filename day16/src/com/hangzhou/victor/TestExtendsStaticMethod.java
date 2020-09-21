package com.hangzhou.victor;

/**
 * @Description:   静态方法可以继承，如果子类也写了一样的方法，则父类的方法进行了遮蔽，但是没有进行覆盖，形成多态
 * @Author: victor
 * @Date: 2020/9/19  15:43
 */
public class TestExtendsStaticMethod {
    public static void main(String[] args) {
        Super.method1();
        Sub.method1();         //子类可以继承父类的静态方法，但是不能覆盖，形成多态
        Sub.method2();



        System.out.println("===================");

        Super sub = new Sub();
        sub.method1();        //静态方法不能覆盖，形成多态

        sub.method2();
    }
}


class Super{
    public static void method1(){
        System.out.println("这是super父类静态方法method1");
    }
    public static void method2(){
        System.out.println("这是super父类静态方法method2");
    }

}

class Sub extends Super{
    public static void method1(){
        System.out.println("这是子类的method1");
    }


}