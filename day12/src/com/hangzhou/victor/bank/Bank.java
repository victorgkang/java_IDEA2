package com.hangzhou.victor.bank;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/12  16:37
 */
public class Bank {
    Scanner input = new Scanner(System.in);
    User[] users = new User[5];
    int size = 4;

    /**
     * 初始化账户
     */
    public void initial() {
        User user = new User();
        user.setCardNo("6227000000001234567");
        user.setPassword("123456");
        user.setUsername("victor");
        user.setIdentityCard("411481202000000000");
        user.setPhone("18987260737");
        user.setBalance(1000000.0);
        users[0] = user;
        users[1] = new User("6227000000001234567", "145264", "marry",
                "411481202000001234", "18854697824", 4000);
        users[2] = new User("6227000000001434587", "146864", "anny",
                "411481202145001234", "18854487824", 7000);
        users[3] = new User("6227000001101234567", "175264", "tom",
                "411481202011101234", "18854287824", 9000);

    }

    /**
     * 欢迎界面
     */
    public void welcome() {
        System.out.println("-----------------------------欢迎使用银行自助服务系统-----------------------------");
        System.out.println("1.开户  2.登陆");
        System.out.println("请选择您好执行的操作：");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                this.register();
            case 2:
                this.logIn();
        }


    }

    /**
     * 登陆功能
     */
    public void logIn() {
        System.out.println("请输入卡号：");
        String no = input.next();
        System.out.println("请输入密码：");
        String psw = input.next();
        User myAccount = this.check(no, psw);
        if (myAccount != null) {
            this.showMenu(myAccount);
        } else {
            System.out.println("账号或密码错误，登陆失败");
        }

    }

    /**
     * 检查账户和密码是否正确
     *
     * @param no  账户
     * @param psw 密码
     * @return 如果账户和密码正确，返回这个账户
     */
    public User check(String no, String psw) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {                      //非空判断
                if (no.equals(users[i].getCardNo()) && psw.equals(users[i].getPassword())) {
                    return users[i];
                }
            }

        }
        return null;
    }

    /**
     * 登陆菜单
     *
     * @param myAccount 我的账户
     */
    public void showMenu(User myAccount) {
        while (true) {
            System.out.println("1.存款  2.取款  3.转账  4.查询余额  5.修改密码  6.修改预留手机号码  7.注销账号  0.退出");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("请输入操作编号：");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    this.deposit(myAccount);
                    break;
                case 2:
                    this.withdrawals(myAccount);
                    break;
                case 3:
                    this.transfer(myAccount);
                    break;
                case 4:
                    this.inquiryBalance(myAccount);
                    break;
                case 5:
                    this.changePassword(myAccount);
                    break;
                case 6:
                    this.changeTelephone(myAccount);
                    break;
                case 7:
                    this.deleteAccount(myAccount);
                    break;
                case 0:
                    System.out.println("执行退出");
                    return;
                default:
                    System.out.println("您输入有误，请重新输入");
            }
        }
    }

    /**
     * 取款功能
     *
     * @param myAccount 需要取款的账户
     */
    public void withdrawals(User myAccount) {
        System.out.println("请输入要取款的金额：");
        double money = input.nextDouble();
        if (money > 0 && money <= myAccount.getBalance()) {
            double currentBalance = myAccount.getBalance() - money;
            myAccount.setBalance(currentBalance);
            System.out.println("您的账户余额为：" + myAccount.getBalance());
        } else {
            System.out.println("余额不足！");
        }
    }

    /**
     * 存款功能
     *
     * @param myAccount 需要存款的账户
     */
    public void deposit(User myAccount) {
        System.out.println("请输入要存款的金额：");
        double money = input.nextDouble();
        double currentBalance = myAccount.getBalance() + money;
        myAccount.setBalance(currentBalance);
        System.out.println("您的账户余额为：" + myAccount.getBalance());
    }

    /**
     * 转账功能
     *
     * @param myAccount 需要转账的账户
     */
    public void transfer(User myAccount) {
        System.out.println("请输入要转账的账户：");
        String transferCardNo = input.next();
        System.out.println("请输入要转账账户的姓名：");
        String name = input.next();
        User transferUser = this.checkToTransfer(transferCardNo, name);

        if (transferUser != null) {

            System.out.println("请输入要转账的金额：");
            double transferMoney = input.nextDouble();
            if (transferMoney > myAccount.getBalance()) {
                System.out.println("您的账户余额不足");
            } else {

                this.addMoneyToTransferMoney(transferUser, transferMoney);     //为另一个账户存钱

                double currentBalance = myAccount.getBalance() - transferMoney;
                myAccount.setBalance(currentBalance);
                System.out.println("您的账户余额为：" + myAccount.getBalance());
            }

        } else {
            System.out.println("您输入的转账账户或姓名有误！！！");
        }
    }

    /**
     * 为另一个账户转账
     *
     * @param transferUser  转账的账户
     * @param transferMoney 转账的金额
     */
    public void addMoneyToTransferMoney(User transferUser, double transferMoney) {
        double currentBalance = transferUser.getBalance() + transferMoney;
        transferUser.setBalance(currentBalance);
    }

    /**
     * @param myAccount
     */
    public void inquiryBalance(User myAccount) {
        System.out.println("您当前的余额为：" + myAccount.getBalance());
    }

    /**
     * @param myAccount
     */
    public void changePassword(User myAccount) {
        System.out.println("请输入您的新密码：");
        String newPassword = input.next();
        myAccount.setPassword(newPassword);
    }

    /**
     * @param myAccount
     */
    public void changeTelephone(User myAccount) {
        System.out.println("请输入您的新手机号：");
        String newTelephone = input.next();
        myAccount.setPhone(newTelephone);
    }

    public User checkToTransfer(String transferCardNo, String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {                      //非空判断
                if (transferCardNo.equals(users[i].getCardNo()) && name.equals(users[i].getUsername())) {
                    return users[i];
                }
            }

        }
        return null;
    }

    public void register() {



        if (size == users.length) {
            this.expand();
        }

        System.out.println("请输入密码：");
        String psw = input.next();
        System.out.println("请输入身份证号：");
        String identityCard = input.next();
        System.out.println("请输入姓名：");
        String username = input.next();
        System.out.println("请输入手机号：");
        String telephone = input.next();

        Random random = new Random();
        String prefix = "622700000000";


        int suffix = random.nextInt(9000000) + 1000000;
        String cardNo = prefix + suffix;

        User user = new User();
        user.setCardNo(cardNo);
        user.setPassword(psw);
        user.setIdentityCard(identityCard);
        user.setUsername(username);
        user.setPhone(telephone);
        users[size]=user;
        size++;



    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i].getCardNo()+"\t"+users[i].getPassword()+"\t"+users[i].getUsername()
            +"\t"+users[i].getIdentityCard()+"\t"+users[i].getPhone()+"\t"+users[i].getBalance());
        }
    }

    /**
     * users数组扩容
     */
    public void expand() {
        users= Arrays.copyOf(users,users.length*2);
    }

    /**
     * 删除指定账户
     * @param myAccount 要删除的账户
     */
    public void deleteAccount(User myAccount) {
        int index=size-1;
        for (int i = 0; i < users.length; i++) {
            if (myAccount == users[i]) {
                index=i;
            }
        }
        for (int i = index; i <size-1 ; i++) {
            users[i]=users[i+1];
        }
        size--;
    }





}
