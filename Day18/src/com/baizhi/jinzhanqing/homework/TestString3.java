package com.baizhi.jinzhanqing.homework;

public class TestString3 {
    public static void main(String[] args) {
        String a = "hello";
        StringBuilder stringBuilder = new StringBuilder(a);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }
}
