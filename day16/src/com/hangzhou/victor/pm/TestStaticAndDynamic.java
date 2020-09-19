package com.hangzhou.victor.pm;

/**
 * @Description:  创建子类对象时，优先加载父类静态属性和静态代码块，子类静态属性和静态代码块，然后再进行父类实例属性和实例代码块，
 *                子类实例属性和实例代码块。再次创建子类对象时，父类和子类静态属性和静态代码块不再执行，直接执行父类实例属性和实例
 *                代码块，然后执行子类实例属性和实例代码块。
 * @Author: victor
 * @Date: 2020/9/19  17:00
 */
public class TestStaticAndDynamic {
    public static void main(String[] args) {
        new Son();
        System.out.println("===================");
        new Son();
    }
}

class Father{
    static String fatherStaticField ="父类静态属性";
    static {
        System.out.println(fatherStaticField);
        System.out.println("父类静态代码块");
    }

    String fatherField ="父类实例属性";
    {
        System.out.println(fatherField);
        System.out.println("父类动态代码块");
    }




}

class Son extends Father{
    static String sonStaticField ="子类静态属性";
    static {
        System.out.println(sonStaticField);
        System.out.println("子类静态代码块");
    }

    String sonField ="子类实例属性";
    {
        System.out.println(sonField);
        System.out.println("子类动态代码块");
    }

}