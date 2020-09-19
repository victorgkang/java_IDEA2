package com.hangzhou.victor;

/**
 * @Description:  封装
 * @Author: victor
 * @Date: 2020/9/12  9:47
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(100);
        System.out.println(stu1.getAge());
    }
}

/**
 * 这是一个学生类
 */
class Student{
    String name;
    private int age;
    String sex;
    double score;
    public Student(){

    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }


}