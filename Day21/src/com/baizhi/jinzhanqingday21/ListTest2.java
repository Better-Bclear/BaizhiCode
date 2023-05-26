package com.baizhi.jinzhanqingday21;

import java.util.LinkedList;
//LinkedList的使用
public class ListTest2 {
    public static void main(String[] args) {
        //创建LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        //添加元素
        list.add("sdjhfk");
        System.out.println(list);
        list.add("sfdfjk");
        System.out.println(list);
        //获取元素
        String s = list.get(0);
        System.out.println(s);
        //删除元素
        list.remove(0);
        System.out.println(list);
        //设置元素
        list.set(0,"金湛清");
        System.out.println(list);

    }
}
