package com.hangzhou.victor;

/**
 * @Description: 运用方法的重载来计算学生的总成绩。
 * @Author: victor
 * @Date: 2020/9/10  20:48
 */
public class TestSchool {
    public static void main(String[] args) {
        student stu1 = new student();
        student stu2 = new student();
        stu1.name = "Tom";
        stu1.age = 18;
        stu1.sex = '男';
        stu1.score = 99;

        stu2.name = "Jack";
        stu2.age = 20;
        stu2.sex = '男';
        stu2.score = 97;

        student stu3 = new student();
        stu3.name = "Mary";
        stu3.age = 21;
        stu3.sex = '女';
        stu3.score = 96;

        Teacher t1 = new Teacher();
        double sum = t1.totalScore(stu1.score, stu2.score);
        System.out.println(sum);

        double[] array = {stu1.score, stu2.score, stu3.score};
        double sum2 = t1.totalScore(array);
        System.out.println(sum2);

    }
}

class student {
    String name;
    int age;
    char sex;
    double score;

    public student() {
    }

    public student(String name, int age, char sex, double score) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }

    public student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public student(char sex, double score) {
        this.sex = sex;
        this.score = score;
    }
}

class Teacher {
    String name;
    int age;
    char sex;
    double salary;

    public Teacher(String name, int age, char sex, double salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public Teacher() {
    }

    public double totalScore(double score1, double score2) {
        double sum = 0;
        sum = score1 + score2;
        return sum;
    }

    public double totalScore(double[] score) {
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }
}

