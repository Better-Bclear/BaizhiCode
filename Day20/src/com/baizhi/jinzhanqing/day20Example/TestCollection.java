package com.baizhi.jinzhanqing.day20Example;

import java.util.ArrayList;
import java.util.List;
public class TestCollection {
    public static void main(String[] args) {
        /*Collection collection = new ArrayList();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.forEach(System.out::println);
        System.out.println(collection);
//        collection.clear();
        System.out.println(collection);
        System.out.println(collection.contains("aaa"));
        System.out.println(collection.isEmpty());
        collection.remove("ccc");
        System.out.println(collection);
        System.out.println(collection.size());*/
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        输出下标为3的元素
        System.out.println(list.get(3));//4
//        输出数字3的下标
        System.out.println(list.indexOf(3));//2
//        移除下标为3的元素
        System.out.println(list.remove(3));
//        设置指定下标处的元素
        System.out.println(list.set(0, 0));
//        截取子集合
        System.out.println(list.subList(0, 2));
    }
}
