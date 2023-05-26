package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Forth {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; set.size() !=10 ; i++) {
            int i1 = random.nextInt(51);
            set.add(i1);
        }
        set.forEach(System.out::println);
    }
}
