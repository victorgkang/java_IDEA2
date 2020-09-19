package com.hangzhou.guokang.day7;

/**
 * @Description: 定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
 * 请定义出手机类，类中要有空参、有参构造方法，set/get方法。
 * 定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
 * 操作步骤：
 * 1. 定义手机类，手机类中定义String类型的品牌，int类型的价格，String类型的颜色，三个成员变量都用private修饰。
 * 2. 提供空参构造方法和有参构造方法。
 * 3. 提供set/get方法。
 * 4. 编写打电话的成员方法，方法中对成员变量进行使用。
 * 5. 编写发短信的成员方法，方法中对成员变量进行使用。
 * 6. 在测试类中创建手机对象，使用set方法赋值，分别调用各个方法。
 * @Author: victor
 * @Date: 2020/9/10  19:47
 */
public class Homework1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setPrice(3998);
        phone1.call();
        phone1.sendMessage();
    }
}

class Phone {
    private String band;
    private int price;
    private String color;

    public Phone() {

    }

    public Phone(String band, int price, String color) {
        this.band = band;
        this.price = price;
        this.color = color;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getBand() {
        return this.band;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void call(){
        System.out.println("正在使用价格为"+price+"元黑色的小米手机打电话....");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+price+"元黑色的小米手机发短信....");
    }
}