package com.hangzhou.guokang.day7;

/**
 * @Description: 定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
 * 定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()
 * <p>
 * 要求：
 * ​	1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法
 * ​	2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
 * ​	3.调用成员方法,打印格式如下:
 * 工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
 * 工号为135基本工资为10000的程序员正在努力的写着代码......
 * 操作步骤：
 * 1. 定义项目经理类，定义成员变量，构造方法，set和get方法，work方法，方法中根据打印格式输出id,salary,bonus的值。
 * 2. 定义程序猿类，定义成员变量，构造方法，set和get方法，work方法，方法中根据打印格式输出id和salary的值。
 * 3. 在测试类中使用有参构造创建项目经理对象并赋值，调用工作方法打印结果。
 * 4. 在测试类中使用有参构造创建程序员对象并赋值，调用工作方法打印结果。
 * @Author: victor
 * @Date: 2020/9/12  11:15
 */
public class Homework3 {
    public static void main(String[] args) {
        Manager manager1 = new Manager(123, 15000, 6000);
        manager1.work();
        Coder coder1 = new Coder(135, 1000);
        coder1.work();
    }
}

class Manager {
    private String name;
    private int id;
    private double salary;
    private double bonus;

    public Manager() {
    }

    /**
     *
     * @param id ID
     * @param salary 薪水
     * @param bonus 奖金
     */
    public Manager(int id, double salary, double bonus) {
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    /**
     *
     * @param name   名字
     * @param id      ID
     * @param salary   工资
     * @param bonus   奖金
     */
    public Manager(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    /**
     * 这是经理工作
     */
    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "奖金为" + bonus + "的项目经理正在努力的" +
                "做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}

class Coder {
    private String name;
    private int id;
    private double salary;
    private double bonus;

    public Coder() {
    }

    public Coder(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public Coder(int id, double salary, double bonus) {
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public Coder(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "的程序员正在努力的写着代码......");
    }
}