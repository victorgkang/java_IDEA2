package com.hangzhou.victor;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/21  20:12
 */
public class Test {
    public static void main(String[] args) {


        Foo f1 = new Foo();
        Foo f2 = new Foo();
        Foo f3 = new Foo();
        System.out.println(f1.id + " " + f2.id + " " + f3.id + " " + Foo.i);

        System.out.println("=======================================");
        MyClass myClass1 = new MyClass();
        System.out.println(myClass1.j);
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1.i);
        System.out.println(myClass1.j);
        System.out.println(myClass2.i);
        System.out.println(myClass2.j);

        System.out.println("=======================================");
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));//输出true
        System.out.println((a == e));//输出false


    }

}

class Foo {
    int id;
    static int i;

    public Foo() {
        id = i++;
    }
}
class MyClass{
    public final double i = Math.random();
    public static double j = Math.random();
}


