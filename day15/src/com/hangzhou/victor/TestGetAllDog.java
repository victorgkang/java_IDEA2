package com.hangzhou.victor;

/**
 * @Description:      getAllDogs多态的应用，开箱与封箱的应用
 * @Author: victor
 * @Date: 2020/9/17  20:39
 */
public class TestGetAllDog {
    public static void main(String[] args) {

        long current = System.nanoTime();

        Animal[] animals = new Animal[6];
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        animals[0] = new Dog("anni");
        animals[1] = new Cat("tom");
        animals[2] = new Dog("marry");
        animals[3] = new Cat("lily");
        animals[4] = new Dog("mechael");
        animals[5] = new Cat("tiny");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        Dog[] allDogs = getAllDogs(animals);
        for (int i = 0; i < allDogs.length; i++) {
            System.out.println(allDogs[i].getName());
        }

        System.out.println(System.nanoTime()-current);
    }

    public static Dog[] getAllDogs(Animal[] animals) {
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog) {
                count++;
            }
        }
        Dog[] dogs = new Dog[count];
        int size=0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog){
                dogs[size]=(Dog) animals[i];
                size++;
            }
        }


        return dogs;
    }


}

class Animal {

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
}