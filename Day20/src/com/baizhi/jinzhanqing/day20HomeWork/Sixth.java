package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.*;

/*(Map)编程：定义一个银行用户 BankUser 类，用户信息为用户 id、用户名 userName、余额 balance;
(1) 利用 HashMap 存储用户信息：id 作为键，用户作为值，创建多个用户对象进行存储
(2) 遍历打印输出所有银行的用户名和对应的余额
(3) 键盘输入一个用户名，检测是否存在此用户，存在-打印用户信息；不存在-打印查无此人
(4) 打印输出余额大于 200000 的用户信息
*/
public class Sixth {
    public static void main(String[] args) {
        Map<Integer,BankUser> map = new HashMap<>();
        BankUser b1 = new BankUser(1, "张三", 1000.0);
        BankUser b2 = new BankUser(2, "李四", 200000.0);
        BankUser b3 = new BankUser(3, "王五", 300000.0);
        map.put(b1.getId(),b1);
        map.put(b2.getId(),b2);
        map.put(b3.getId(),b3);
        map.forEach((k,v)->{
            System.out.println(k+":"+v.getUserName()+":"+v.getBalance());
        });
        System.out.println("====================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = scanner.next();
        List<BankUser> list = new ArrayList<>();
        map.forEach((k,v)->{
            if(v.getUserName().equals(userName)){
                list.add(v);
                System.out.println(k+":"+v.getUserName()+":"+v.getBalance());
            }
        });
        if (list.size()==0){
            System.out.println("查无此人");
        }
        System.out.println("====================================");
        map.forEach((k,v)->{
            if (v.getBalance()>200000){
                System.out.println(k+":"+v.getUserName()+":"+v.getBalance());
            }
        });
    }
}
