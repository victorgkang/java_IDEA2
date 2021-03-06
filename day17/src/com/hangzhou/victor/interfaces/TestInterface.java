package com.hangzhou.victor.interfaces;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/22  19:59
 */
public class TestInterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        Cat cat = new Cat();
        cat.climb();
        Fish fish = new Fish();
        fish.swim();

        System.out.println("=====================");

        Runnable r = new Bus();   //接口引用实现类对象，仅可调用接口中所声明的方法
        r.run();
    }
}

class Animal {
    String breed;
    int age;

    public void eat() {
    }

    public void sleep() {
    }

}

class Dog extends Animal implements Runnable {
    String furcolor;

    @Override
    public void run() {
        System.out.println("狗会跑...");
    }
}

class Cat extends Animal implements Climbable {
    String furcolor;

    @Override
    public void climb() {
        System.out.println("猫会爬树...");
    }
}

class Fish extends Animal implements Swimmable {

    @Override
    public void swim() {
        System.out.println("鱼会游...");
    }
}

class Bus implements Runnable {

    @Override
    public void run() {
        System.out.println("公交车在跑...");
    }
}

class Car implements Runnable {


    @Override
    public void run() {

    }
}
