package com.hangzhou.victor;

/**
 * @Description:  创建一个类，并创建一个对象，引用对象的属性与方法。
 * @Author: victor
 * @Date: 2020/9/10  18:43
 */
public class TestStudent {
    public static void main(String[] args) {
        student stu1 = new student();
        stu1.name="victor";
        stu1.age=18;
        stu1.sex='男';
        stu1.score=100;

        stu1.sayHi();
    }
}

class student{
    String name;
    int age;
    char sex;
    double score;
    public void sayHi(){
        System.out.println("大家好，我叫"+name+"今年"+age+"了，我的性别是"+sex+"，我的成绩是"+score);
    }
}
