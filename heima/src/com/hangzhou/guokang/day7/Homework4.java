package com.hangzhou.guokang.day7;

/**
 * @Description: 定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
 * 定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
 * 要求:
 * ​	1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，set和get方法
 * ​	2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
 * ​	3.调用成员方法,打印格式如下:
 * 花色的波斯猫正在吃鱼.....
 * 花色的波斯猫正在逮老鼠....
 * 黑色的藏獒正在啃骨头.....
 * 黑色的藏獒正在看家.....
 * 操作步骤：
 * 1. 定义猫类，定义成员变量，构造方法，set和get方法，吃饭方法eat()，抓老鼠方法catchMouse()，方法中根据题目给出的格式输出成员变量的值。
 * 2. 定义狗类，定义成员变量，构造方法，set和get方法，吃饭方法eat()，看家方法lookHome()，方法中根据题目给出的格式输出成员变量的值。
 * 3. 在测试类中使用有参构造创建猫类对象，调用eat()方法和catchMouse()方法。
 * 4. 在测试类中使用有参构造创建狗类对象，调用eat()方法和lookHome()方法。
 * @Author: victor
 * @Date: 2020/9/12  11:36
 */
public class Homework4 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("花色", "波斯猫");
        cat1.eat();
        cat1.catchMouse();
        Dog dog1 = new Dog("黑色", "藏獒");
        dog1.eat();
        dog1.lookHome();
    }
}

class Cat {
    private String color;
    private String breed;

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println(color + "的" + breed + "正在吃鱼.....");
    }

    public void catchMouse() {
        System.out.println(color + "的" + breed + "正在逮老鼠....");
    }
}

class Dog {
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println(color + "的" + breed + "正在啃骨头.....");
    }

    public void lookHome() {
        System.out.println(color + "的" + breed + "正在看家.....");
    }
}