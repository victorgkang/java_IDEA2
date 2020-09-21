package com.hangzhou.victor;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/21  16:04
 */
public class Animals{
    private String breed;
    private int age;
    private String sex;

    public Animals() {
    }

    public Animals(String breed, int age, String sex) {
        this.breed = breed;
        this.age = age;
        this.sex = sex;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
