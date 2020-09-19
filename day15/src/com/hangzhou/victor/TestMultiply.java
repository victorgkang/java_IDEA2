package com.hangzhou.victor;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/18  16:56
 */
public class TestMultiply {
    public static void main(String[] args) {

        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"×"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }

        System.out.println("=================================");

        int i=1;
        while (i<=9){
            int j=1;

            while (j<=i){
                System.out.print(j+"×"+i+"="+(i*j)+"\t");
                j++;
            }
            i++;
            System.out.println();


        }





    }

    public static int sum(int... array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=i;
        }


        return sum;
    }


}
