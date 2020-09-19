package com.jiangsu.guokang;


public class TestArray {

    public static void main(String[] args) {

        int[] numbers = new int[4];     //这是一行注释；


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        double[] score = new double[4];
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        boolean[] bo = new boolean[4];
        for (int i = 0; i < bo.length; i++) {
            System.out.println(bo[i]);
        }
        String[] names = new String[4];
        names[0] = "jack";
        names[1] = "jack";
        names[2] = "jack";
        names[3] = "jack";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            name();

        }

    }

    public static void name() {
        System.out.println("*");
    }

}
