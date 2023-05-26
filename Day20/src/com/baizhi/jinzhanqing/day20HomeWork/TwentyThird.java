package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TwentyThird {
    public static void main(String[] args) {
        String s = "ssssssdfsdfsadsfawefdsadfdsdf";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        Map<Character,Integer> map = set.stream().collect(Collectors.toMap(k->k,v->0));
        for (Character c :
                s.toCharArray()) {
            map.put(c,map.get(c)+1);
        }
        System.out.println(map);
    }
}
