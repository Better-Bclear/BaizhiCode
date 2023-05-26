package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Seventh {
    public static void main(String[] args) {
        //从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。如果该年没有举办世界 杯，则输出：没有举办世界杯
        Map<String ,String > map = new HashMap<>();
        map.put("2006","意大利");
        map.put("2002","巴西");
        map.put("1998","法国");
        map.put("1994","巴西");
        map.put("1990","德国");
        map.put("1986","阿根廷");
        map.put("1982","意大利");
        map.put("1978","阿根廷");
        map.put("1974","德国");
        map.put("1970","巴西");
        map.put("1966","英格兰");
        map.put("1962","巴西");
        map.put("1958","巴西");
        map.put("1954","德国");
        map.put("1950","乌拉圭");
        map.put("1938","意大利");
        map.put("1934","意大利");
        map.put("1930","乌拉圭");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入世界杯年份");
        String next = scanner.next();
        if (map.get(next)!=null){
            System.out.println(map.get(next));
        }else {
            System.out.println("没有举办世界杯");
        }
//        读入一支球队的名字，输出该球队夺冠的年份列表
        System.out.println("请输入一至球队");
        String next1 = scanner.next();
        Set<String> strings = map.keySet();
        strings.forEach(item->{
            if(map.get(item).equals(next1)){
                System.out.println(item);
            }
        });
    }
}
