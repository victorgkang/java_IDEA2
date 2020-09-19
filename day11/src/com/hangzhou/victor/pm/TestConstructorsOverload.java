package com.hangzhou.victor.pm;

/**
 * @Description: 构造方法的重载（如果在类中存在有参的构造方法，那么无参的构造方法必须写上）
 * @Author: victor
 * @Date: 2020/9/10  22:14
 */
public class TestConstructorsOverload {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sleep();

    }
}

class Dog{
    String variety ;
    int age;
    String color;
    double weight;

    public Dog() {
    }

    public Dog(String variety, int age, String color, double weight) {
        this.variety = variety;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public Dog(String variety, double weight) {
        this.variety = variety;
        this.weight = weight;
    }

    public Dog(double weight) {
        this.weight = weight;
    }
    public void eat(){
        System.out.println("executed eating...");
    }
    public void sleep(){
        System.out.println("executed sleeping...");
    }
}
