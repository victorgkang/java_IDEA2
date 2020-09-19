package com.hangzhou.victor;

/**
 * @Description:   动态代码块每次创建一个新的对象就要重新加载一次，然而静态代码块只需加载一次即可
 * @Author: victor
 * @Date: 2020/9/19  16:21
 */
public class TestClassLoad {
    public static void main(String[] args) {
        Father father1 = new Father();
        Father father2 = new Father();
        System.out.println("=========================");
        Son.method();
        Son.method();
    }
}

class Father{
    String field="实例属性";
    {
        System.out.println(field);
        System.out.println("动态代码块");
    }

    public Father(){
        System.out.println("无参构造方法");
    }



}

class Son{
    static String staticField="静态属性";
    static {
        System.out.println(staticField);
        System.out.println("静态代码块");
    }

    public static void method(){
        System.out.println("静态方法");
    }
}