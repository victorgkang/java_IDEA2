package com.hangzhou.victor;

/**
 * @Description: new一个女朋友，和女朋友一起生了一个孩子，最后一家人幸福地生活在了一起。
 * @Author: victor
 * @Date: 2020/9/18  17:28
 */
public class GenerateGirlfriend {
    public static void main(String[] args) {
        //new一个女朋友
        Girlfriend girlfriend = new Girlfriend();
        girlfriend.setName("小芳");
        girlfriend.setHeight(175);
        girlfriend.setWeight(50);
        girlfriend.setAppearance("very beautiful");

        /*
         * 不知道女朋友生的孩子是男孩还是女孩，因此用父类对象来接收，将baby对象进行装箱
         */
        Child myChild = girlfriend.bornChild();
        if (myChild instanceof Boy) {
            myChild.setName("小明");   //如果是男孩，就叫小明
        } else {
            myChild.setName("小花");   //如果是女孩，就叫小花
        }
        myChild.playFun();

        /*
         * 因为男孩女孩上卫生间不同，就要对baby进行拆箱，男孩就上男卫生间，女孩就上女卫生间
         */
        if (myChild instanceof Boy) {      //拆箱：男孩上男卫生间，女孩上女卫生间。
            Boy myBoy = (Boy) myChild;
            boyBathroom(myBoy);
        } else {
            Girl myGirl = (Girl) myChild;
            girlBathroom(myGirl);
        }

        girlfriend.happiness(myChild);    //最后一家人幸福地生活在一起。


    }

    /**
     * 男孩上男卫生间
     * @param myBoy 传入一个男孩的对象
     */
    public static void boyBathroom(Boy myBoy) {

        System.out.println(myBoy.getName() + "正在上男卫生间...");
    }

    /**
     * 女孩上女卫生间
     * @param myGirl 传入一个女孩的对象
     */
    public static void girlBathroom(Girl myGirl) {
        System.out.println(myGirl.getName() + "正在上女卫生间...");
    }
}

class Girlfriend {
    private String name;
    private double height;
    private double weight;
    private String appearance;

    /**
     * 生成有参构造和无参构造
     */
    public Girlfriend() {
    }

    public Girlfriend(String name, double height, double weight, String appearance) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.appearance = appearance;
    }

    /**
     * 生成get，set方法
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    /**
     * 生孩子的方法
     * @return  返回一个baby（生男，生女不知道）
     */
    public Child bornChild() {
        Child baby;
        int b = (int) (Math.random() * 2);    //生成随机数，如果是1就是男孩，如果是0就是女孩。
        if (b == 1) {
            baby = new Boy();
        } else {
            baby = new Girl();
        }
        return baby;
    }

    /**
     * 一家人幸福地在一起
     * @param child  生的孩子
     */
    public void happiness(Child child) {
        System.out.println("我和我的老婆" + this.name + ",还有我的孩子" + child.getName() + "，幸福地生活在一起");
    }


}

abstract class Child {
    private String name;

    /**
     * 父类有参构造和无参构造
     */
    public Child() {
    }

    public Child(String name) {
        this.name = name;
    }

    /**
     * get,set方法必须有，方便子类调用
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 玩耍的方法，以便于子类进行覆盖。
     */
   abstract public  void playFun();

}

class Boy extends Child {

    public Boy() {

    }

    /**
     * 调用父类进行子类有参构造
     * @param name 孩子的名字
     */
    public Boy(String name) {
        super(name);
    }

    /**
     * 子类对父类的方法进行覆盖
     */
    public void playFun() {
        System.out.println(this.getName() + "喜欢和爸爸一起玩奥特曼");
    }
}

class Girl extends Child {
    public Girl() {
    }

    /**
     * 调用父类进行子类有参构造
     * @param name 孩子的名字
     */
    public Girl(String name) {
        super(name);
    }

    /**
     * 子类对父类的方法进行覆盖
     */
    public void playFun() {
        System.out.println(this.getName() + "喜欢和爸爸一起玩芭比娃娃");
    }


}


