package com.hangzhou.victor;

import java.util.Scanner;

/**
 * @Description: 编写学生类
 * 属性
 * name
 * age
 * sex
 * address
 * 方法
 * run
 * eat
 * sleep
 * <p>
 * 新生入学,需要录入学生信息, 编写程序, 录入资料系统,把这写学生放入数组
 * 输出年龄是大于23岁的学生的名字
 * 输出地址在杭州的学生的所有信息
 * @Author: victor
 * @Date: 2020/9/17  21:33
 */
public class Homework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            /*   如需要键盘录入，请参考如下注释掉的代码。
            System.out.println("请录入姓名：");
            students[i].name=input.next();
            System.out.println("请录入年龄：");
            students[i].age=input.nextInt();
            System.out.println("请录入性别：");
            students[i].sex=input.next();
            System.out.println("请录入地址：");
            students[i].address=input.next();
            */
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        students[0].name = "tom";
        students[0].age = 24;
        students[0].sex = "男";
        students[0].address = "杭州";

        students[1].name = "marry";
        students[1].age = 19;
        students[1].sex = "女";
        students[1].address = "南京";

        students[2].name = "mechael";
        students[2].age = 20;
        students[2].sex = "男";
        students[2].address = "南京";

        for (int i = 0; i < students.length; i++) {
            if (students[i].age > 23) {
                System.out.println("年龄大于23的学生的名字为："+students[i].name);
            }
            if (students[i].address.equals("杭州")){
                System.out.println("地址在杭州学生的名字为："+students[i].name+",性别为："+students[i].sex+",年龄为:"+students[i].age);
            }
        }

    }
}

class Student {
    String name;
    int age;
    String sex;
    String address;

    public void run() {

    }

    public void eat() {

    }

    public void sleep() {

    }
}


