package com.baizhi.jinzhanqingday21;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
    public static void main(String[] args) {
//        使用一个集合存储所有学生的年龄
        List ages = new ArrayList();
        ages.add("11");
//        数据不是年龄也能输入，集合不会坐判断
        ages.add("sdfhj");
//        泛型必须是引用数据类型

//        JDK5新特性中支持泛型的自动推断
        List<Integer> list = new ArrayList<>();
        list.add(3);//自动装箱
//        编译报错 指定集合的泛型为Integer 则元素必须为Integer类型
//        在编译时会检查元素的数据类型是否和泛型指定的类型匹配
        System.out.println(list);
        for (int i :
                list) {
            System.out.println(i);
        }
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        list1.forEach(System.out::println);

        Paper<Boolean> paper = new Paper<>();
        paper.setContent(true);
        System.out.println(paper.getContent());
        CA ca = new CA();
        System.out.println(ca.method(list1));
    }
}
