package com.hangzhou.guokang.string;

import java.util.Scanner;

/**
 * @Description: 用户登录，登录三次错误，禁止登录
 * @Author: victor
 * @Date: 2020/9/3  11:44
 */
public class TestEnter {
    public static void main(String[] args) {
        String username = "victor";
        String password = "147258";
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名：");
            String myUsername = input.nextLine();
            System.out.println("请输入密码");
            String myPassword = input.nextLine();
            if (username.equals(myUsername) && password.equals(myPassword)) {
                System.out.println("恭喜你，登录成功");
                break;
            } else {
                if (i == 3) {
                    System.out.println("您的登录次数已达上限，请明日再来");
                }
                System.out.println("登录失败您还有" + (3 - i) + "次登录机会");
            }


        }
    }
}
