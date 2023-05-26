package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = scanner.next();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        set.forEach(System.out::print);
    }
}
