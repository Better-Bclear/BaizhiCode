package com.baizhi.jinzhanqing.homework;

import java.util.Objects;
import java.util.Scanner;

/*
* 2. (Object 类)编程：定义一个用户类(User 类)，属性有用户名、用户密码 password、电话(tel)， 要求如下：
*(1) 对类进行封装，提供 get/set 方法；同时提供无参数、有参数的构造方法
* (2) 覆盖 toString 方法，要求格式为： username：一如既往，password：123456，tel：13051800688
* (3) 覆盖 equals 方法，要求：只要用户名相同则为相同对象
* (4) 写一个测试类，利用键盘分别输入两个用户信息并存储 Use 对象中，判断两个对象是否相同。
* */
public class TestUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("金湛清1","sdfjhdjsf","1232221");
        User user1 = new User("金湛清1", "sdjfhjdhfj", "8736237");
        System.out.println(user.equals(user1));
    }
}
class User{
    private String username;
    private String password;
    private String tel;

    public User() {
    }

    public User(String username, String password, String tel) {
        this.username = username;
        this.password = password;
        this.tel = tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, tel);
    }

    @Override
    public String toString() {
        return "username:" + username +
                ", password:" + password +
                ", tel:" + tel ;
    }
}

