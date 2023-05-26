package com.baizhi.jinzhanqing.day20HomeWork;

public class BankUser {
    private int id;
    private String userName;
    private double balance;

    public BankUser() {
    }

    public BankUser(int id, String userName, double balance) {
        this.id = id;
        this.userName = userName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
