package com.hangzhou.victor;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/15  20:47
 */
public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("圆的面积为：" + circle.area(10));

        Rect rect = new Rect();
        System.out.println("矩形的面积为："+rect.area(10, 20));

        Square square = new Square();
        System.out.println("正方形的面积为："+square.area(10));
    }
}

class Shape {

    public double area() {
        return 0.0;

    }

    public double grith() {
        return 0.0;
    }

}

class Circle extends Shape {

    double radius;


    public double area(double radius) {

        return Math.PI * radius * radius;

    }

    public double grith(double radius) {
        return 2 * Math.PI * radius;
    }

}

class Rect extends Shape {
    double lon;
    double wide;

    public double area(double lon, double wide) {
        return lon * wide;

    }

    public double grith(double lon, double wide) {
        return 2 * (lon + wide);
    }
}

class Square extends Rect {

    double length;

    public double area(double length) {
        return length * length;

    }

    public double grith(double length) {
        return length * 4;
    }
}