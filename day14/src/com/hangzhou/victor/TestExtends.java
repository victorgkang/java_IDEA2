package com.hangzhou.victor;

/**
 * @Description:  get,set 方法可以二次修改对象的值，构造方法只能一次使用，不能二次使用。
 * @Author: victor
 * @Date: 2020/9/16  19:37
 */
public class TestExtends {
    public static void main(String[] args) {
        Animals animals1 = new Animals("狗",1,"雄");
        System.out.println(animals1.getBreed()+"\t"+animals1.getAge()+"\t"+animals1.getSex());

        Animals animals2 = new Animals();
        animals2.setBreed("猫");
        animals2.setAge(2);
        animals2.setSex("雌");
        System.out.println(animals2.getBreed()+"\t"+animals2.getAge()+"\t"+animals2.getSex());

    }
}

class Animals{
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