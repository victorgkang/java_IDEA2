package com.hangzhou.victor;

import java.util.Scanner;

/**
 * @Description: 银行ATM
 * 	模拟银行账户业务，实现存款、取款和余额查询。运行效果如下所示：
 *
 * 	1.存款  2.取款  3.查询  0.退出
 * 	请选择你要办理的业务：1
 * 	请输入存款金额：1000
 * 	---------
 * 	存款成功！
 *
 * 	1.存款  2.取款  3.查询  0.退出
 * 	请选择你要办理的业务：2
 * 	请输入取款金额：100
 * 	---------
 * 	取款成功！
 *
 * 	1.存款  2.取款  3.查询  0.退出
 * 	请选择你要办理的业务：3
 * 	---您当前账户余额：900元---
 *
 * 	1.存款  2.取款  3.查询  0.退出
 * 	请选择你要办理的业务：0
 *
 * 	O(∩_∩)O谢谢您的使用，欢迎下次光临！
 * @Author: victor
 * @Date: 2020/9/17  19:12
 */
public class TestBank {
    public static void main(String[] args) {


        Bank bank = new Bank();
        System.out.println(bank);
        bank.showMenu();


    }
}

class Bank {
    private double balance;

    public Bank() {
    }

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double money) {
        balance = balance + money;
    }

    public void withdrawals(double money) {
        balance = balance - money;
    }

    public void showMenu() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1.存款  2.取款  3.查询  0.退出");
            System.out.println("请选择你要办理的业务：");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入存款金额：");
                    double depositMoney = input.nextDouble();
                    this.deposit(depositMoney);
                    System.out.println("--------------");
                    System.out.println("存款成功！");
                    break;
                case 2:
                    System.out.println("请输入取款金额：");
                    double withdrawlsMoney = input.nextDouble();
                    this.withdrawals(withdrawlsMoney);
                    System.out.println("--------------");
                    System.out.println("取款成功！");
                    break;
                case 3:
                    System.out.println("---您当前账户余额" + balance + "元---");
                    break;
                case 0:
                    System.out.println("谢谢您的使用，欢迎下次光临");
                    return;
            }


        }
    }
}