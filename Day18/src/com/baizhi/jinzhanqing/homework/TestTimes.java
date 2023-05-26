package com.baizhi.jinzhanqing.homework;

import java.util.Arrays;

public class TestTimes {
    public static void main(String[] args) {
        String a = "1239586838923173478943890234092";
        int[] counts = new int[10];
        for (int i = 0; i < a.length(); i++) {
            counts[a.charAt(i)-'0']++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i+":" + counts[i]);
        }
    }
}
