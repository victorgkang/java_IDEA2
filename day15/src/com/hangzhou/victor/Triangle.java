package com.hangzhou.victor;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/18  16:42
 */
public class Triangle {
    double firstSide;
    double secondSide;
    double thirdSide;

    public double perimeter(double firstSide, double secondSide, double thirdSide){

        return firstSide+secondSide+thirdSide;
    }

    public double area(double firstSide, double secondSide, double thirdSide){

        double p=0.5*(firstSide+secondSide+thirdSide);
        return Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));
    }
}
