package com.hangzhou.guokang.day7;

/**
 * @Description: 定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。
 * 另外定义一个用于展示三个属性值的show()方法。请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、
 * 洗衣服方法和做饭方法。
 * 打印效果如下：
 * 我女朋友叫刘亦菲,身高175.0厘米,体重100.0斤
 * 女朋友帮我洗衣服
 * 女朋友给我做饭
 * 操作步骤：
 * 1. 定义女朋友类，定义String类型姓名，double类型身高和double类型体重三个成员变量，三个成员变量都用private修饰。
 * 2. 提供空参构造方法和有参构造方法。
 * 3. 提供set/get方法。
 * 4. 编写展示方法show()，方法打印三个成员变量的值。
 * 5. 编写洗衣服wash()方法，输出洗衣服的语句。
 * 6. 编写做饭cook()方法，输出做饭的语句。
 * 7. 在测试类中使用有参构造创建女友对象，分别调用各个方法。
 * @Author: victor
 * @Date: 2020/9/12  10:57
 */
public class Homework2 {
    public static void main(String[] args) {
        Girlfriend myGirlfriend = new Girlfriend();
        myGirlfriend.setName("刘亦菲");
        myGirlfriend.setHeight(175);
        myGirlfriend.setWeight(100);
        myGirlfriend.show();
        myGirlfriend.wash();
        myGirlfriend.cook();
    }
}

class Girlfriend {
    private String name;
    private double height;
    private double weight;


    public Girlfriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Girlfriend() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.println("我女朋友叫" + name + "，身高" + height + "厘米，体重" + weight + "斤。");
    }

    public void wash() {
        System.out.println("我女朋友帮我洗衣服...");
    }

    public void cook() {
        System.out.println("我女朋友帮我做饭...");
    }
}