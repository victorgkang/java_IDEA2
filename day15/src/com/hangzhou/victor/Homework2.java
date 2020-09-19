package com.hangzhou.victor;

/**
 * @Description: * 1、
 * 				定义手机类
 * 					手机有品牌, 型号属性
 * 					手机有上网, 打电话的功能
 * 				定义老师类
 * 					老师有 姓名, 年龄属性
 * 					老师有 教学的功能
 *
 * 			2、
 * 				创建学生类
 * 					属性 	说明
 * 					stuNo 	学号
 * 					name 	姓名
 * 					sex 	性别
 * 					age 	年龄
 *
 * 					方法 	说明
 * 					show() 	显示学生信息(所有属性)
 * 				需求说明
 * 					编写main方法，创建多个学生对象，设置属性的值，调用自我介绍的方法
 *
 * 			使用构造方法和this关键字结合编写类
 * 			使用有参数的构造方法创建他们的对象
 * @Author: victor
 * @Date: 2020/9/18  11:43
 */
public class Homework2 {
    public static void main(String[] args) {

    }
}

class Phone{

    String brand;
    String type;

    public Phone() {
    }

    public Phone(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public void call(){

    }

    public void onInternet(){

    }
}

class Teacher{

    String name;
    int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void teach(){

    }
}

