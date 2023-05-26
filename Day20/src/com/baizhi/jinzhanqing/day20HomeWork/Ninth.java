package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.HashMap;
import java.util.Map;
/*
* (1) 使用 Map，以老师的名字作为键，教授的课程名作为值，表示上述课程安排
* (2) 增加了一位新老师 Allen 教 JDBC
* (3) Lucy 改为教 CoreJava
* (4) 遍历 Map，输出所有的老师及老师教授的课程
* (5) 利用 Map，输出所有教 JSP 的老师
* (6) 统计教授 CoreJava 和 JDBC 老师的人数
* */
public class Ninth {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","JSP");
//        增加了一位新老师 Allen 教 JDBC
        map.put("Allen","JDBC");
//        Lucy 改为教 CoreJava
        map.put("Lucy","CoreJava");
        System.out.println("输出所有的老师及老师教授的课程：");
//        遍历 Map，输出所有的老师及老师教授的课程
        map.keySet().forEach(item->{
            System.out.println(item+","+map.get(item));
        });
        //教JSP的老师
        System.out.println("教JSP的老师：");
        map.keySet().forEach(item->{
            if (map.get(item).equals("JSP")){
                System.out.println(map);
            }
        });
        int cjTeacher;
        int jdbcTeacher = 0;
        cjTeacher = (int) map.keySet().stream().filter(item -> map.get(item).equals("CoreJava")).count();
        jdbcTeacher = (int) map.keySet().stream().filter(item->map.get(item).equals("JDBC")).count();
        System.out.println("教CoreJava的老师的数量为：" + cjTeacher);
        System.out.println("教JDBC的老师的数量为：" + jdbcTeacher);
    }
}
