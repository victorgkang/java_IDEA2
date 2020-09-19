package com.hangzhou.victor;

/**
 * @Description:    方法的重载（在一个类中定义多个名子一样的方法）
 * @Author: victor
 * @Date: 2020/9/10  20:22
 */
public class TestCalculator {
    public static void main(String[] args) {

        Calculator ca = new Calculator();
        System.out.println(ca.add(10.1, 12.2));
        System.out.println(ca.add(414, 25.1, 36.8));
    }
}

class Calculator{
    public double add(double a, double b){
        return a+b;
    }
    public double add (double a, double b, double c){
        return a+b+c;
    }


}
