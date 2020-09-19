package com.hangzhou.victor.pm;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/16  19:51
 */
public class TestSuperKeyWord {
    public static void main(String[] args) {
        Dog dog = new Dog("边牧",1,"雄","黑白");
        dog.method();
    }
}

class Animals{
    String breed;
    int age;
    String sex;
    public Animals(){

    }

}

class Dog extends Animals{

    String furcolor;

    public Dog() {
    }
    public Dog(String breed, int age, String sex){
        super.breed=breed;
        super.age=age;
        super.sex=sex;

    }
    public Dog(String breed, int age, String sex,String furcolor){
        this(breed,age,sex);
        this.furcolor=furcolor;
    }

    public void method(){
        System.out.println(this.furcolor);
        System.out.println(breed);
        System.out.println(this.breed);
        System.out.println(super.breed);

    }

}