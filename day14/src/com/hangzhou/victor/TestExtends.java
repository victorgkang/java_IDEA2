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

