package com.baizhi.jinzhanqing.homework;

import java.util.Scanner;

/*(String 类)编程：任意输入一个字符串，统计字符串中字母的个数。*/
public class TestString {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (!Character.isLetter(a.charAt(i))){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
