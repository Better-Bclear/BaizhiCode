package com.baizhi.jinzhanqingday21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        System.out.println(list.hashCode());
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
//        System.out.println(list.hashCode());
        List<Integer> list1= new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            list1.add(i);
        }
        System.out.println("=======================");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("=======================");
        for (Integer i :
                list1) {
            System.out.println(i);
        }
        System.out.println("=======================");
        list1.forEach(System.out::println);
        System.out.println("=======================");
        System.out.println("迭代器的遍历");
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("删除元素");
        //用fori循环代码输出的结果会不正确
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)%2==0){
                list1.remove(i);
            }
        }
        System.out.println(list1);
        //使用迭代器来删除
        Iterator<Integer> iterator = list1.iterator();
        //需要用迭代器遍历删除
        while(iterator.hasNext()){
            if (iterator.next()%2==0){
                iterator.remove();
            }
        }
        System.out.println(list1);

    }
}
