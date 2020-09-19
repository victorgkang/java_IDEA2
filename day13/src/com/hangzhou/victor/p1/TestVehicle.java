package com.hangzhou.victor.p1;

/**
 * @Description:    对象的继承
 * @Author: victor
 * @Date: 2020/9/15  19:37
 */
public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.price=1000;
    }
}

class Vehicle{
    double price;
    int speed;
    public void run(){

    }

}

class Car extends Vehicle{

}

class Bus extends Vehicle{



}