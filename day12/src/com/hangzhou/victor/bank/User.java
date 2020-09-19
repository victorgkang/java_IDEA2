package com.hangzhou.victor.bank;

/**
 * @Description:
 * @Author: victor
 * @Date: 2020/9/12  16:38
 */
public class User {
    private String cardNo;
    private String password;
    private String username;
    private String identityCard;
    private String phone;
    private double balance;

    public User() {
    }

    public User(String cardNo, String password, String username, String identityCard, String phone, double balance) {
        this.cardNo = cardNo;
        this.password = password;
        this.username = username;
        this.identityCard = identityCard;
        this.phone = phone;
        this.balance = balance;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
