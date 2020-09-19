package com.hangzhou.victor;

/**
 * @Description:   父子类之间的属性关系，super引用的上一个父类，继承的方法只是继承了一个引用，并非在子类中真实存在。。
 * 在引用子类中父类的方法时，直接跳转到父类的方法中。
 * @Author: victor
 * @Date: 2020/9/15  22:22
 */
public class TestBasicSuperKeyWord {
    public static void main(String[] args) {
        Grandson grandson = new Grandson();
        grandson.method();
        grandson.method1();
        grandson.method2();
    }
}

class Father{
    int field=10;

    public void method(){
        System.out.println("这是father类：");
        System.out.println(this.field);
    }

}

class Son extends Father{
    int field=20;

    public void method1(){
        System.out.println("这是son类：");
        System.out.println(super.field);
        System.out.println(this.field);
    }
}

class Grandson extends Son{

    int field=30;
    public void method2(){
        System.out.println("这是grands类：");
        System.out.println(super.field);
        System.out.println(this.field);
    }
}