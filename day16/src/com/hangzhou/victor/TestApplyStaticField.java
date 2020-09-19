package com.hangzhou.victor;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/19  15:03
 */
public class TestApplyStaticField {
    public static void main(String[] args) {
        System.out.println(Animals.getCount());
        System.out.println(Animals.number);
        Animals animal1 = new Animals();
        Animals animal2 = new Animals();
        Animals animal3 = new Animals();
        System.out.println(Animals.getCount());
        System.out.println(Animals.number);


    }
}


class Animals{
    private static int count;
    static int number;

    public Animals(){
        count++;
        number++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animals.count = count;
    }
}