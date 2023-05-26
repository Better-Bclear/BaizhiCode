package com.baizhi.jinzhanqing.homework;

import java.util.Random;

/*
* 5. (String 类)编程：在给定的字符串“ABCDEFGhijklmn1234567”中获取随机的 4 个字符，并使用 StringBuilder 拼接成字符串。（随机获取到的 4 个字符中可以出现重复字符）
* 提示：创建随机数对象 java.util.Random。 java.util.Random random = new java.util.Random(); random.nextInt(100); //可以获取到 0~99 中任意一个随机数
* */
public class TestString2 {
    public static void main(String[] args) {
        Random random = new Random();
        String a = "ABCDEFGhijklmn1234567";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            stringBuilder.append(a.charAt(random.nextInt(a.length())));
        }
        System.out.println(stringBuilder);
    }
}
