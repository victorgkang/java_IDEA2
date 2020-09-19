package com.hangzhou.victor;

/**
 * @Description:  this和super的用法，
 * (1)super关键字：
 * 	     I.	第一种用法：在子类中，可以通过"super."的形式访问父类的属性和方法，可解决一定的属性遮蔽、方法覆盖后的父类成员调用问题，
 * 	     如：super.name，super.run()。
 * 	    II.	第二种用法：super() 表示在子类构造方法的首行，调用父类的无参构造方法，或者super（父类参数）调用父类的有参构造方法。
 *
 * (2)this关键字：
 * 		I.	 this代表“当前实例”，即是模板中的当前对象，模板服务与哪个对象，this就指向哪个对象。
 * 		II.	 this第一种用法：调用本类中的实例属性、实例方法。例如：this.name、this.run() ，
 * 		III. this第二种用法：调用本类中的其他构造方法。例如：this()、this(实参)。注意：必须在构造方法的首行。
 * 		IV.	 默认来讲，实例属性和方法前的this.隐式存在。
 * @Author: victor
 * @Date: 2020/9/18  21:56
 */
public class TestSuperKeyWord {
    public static void main(String[] args) {
        new Grandson();
        Grandson grandson = new Grandson(10,20,30);
        grandson.setField(10);
        grandson.setField2(20);
        grandson.setField3(30);
    }
}

class Father{
    private int field;


    public Father() {
        System.out.println("父类对象"+this.field);
    }

    public Father(int field) {
        this.field = field;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public void play(){
        System.out.println("爸爸玩的很开心");
    }


}

class Son extends Father {
    private int field2;

    public Son() {
        super.play();
        System.out.println("儿子类对象"+this.field2);
    }

    public Son(int field2) {
        this.field2 = field2;
    }


    public Son(int field, int field2) {
        super(field);
        this.field2 = field2;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public void play(){
        System.out.println("儿子玩的很开心");
    }

}


class Grandson extends Son{

    private int field3;

    public Grandson() {
        System.out.println("孙子类对象"+this.field3);
    }

    public Grandson(int field, int field2, int field3) {
        super(field,field2);
        this.field3 = field3;
    }

    public int getField3() {
        return field3;
    }

    public void setField3(int field3) {
        this.field3 = field3;
    }

    public void play(){
        System.out.println("孙子玩的很开心");
    }

}