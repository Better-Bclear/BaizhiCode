package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.ArrayList;
import java.util.List;
/*
* 2. (List)编程：已知有 Worker 类，属性为姓名、年龄、工资，完成类的封装并提供无参数、有参数构造 方法，完成以下要求：
* (1) 创建一个 List，在 List 中增加三个工人，基本信息如下 :
* (2) 在 li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资 3300
* (3) 删除 wang5 的信息
* (4) 利用下标遍历，打印输出所有工人信息
* (5) 利用 forEach 遍历，打印输出所有年龄大于 20 的工人信息
* (6) 利用自遍历的方式，打印输出工人姓名长度大于 6 的信息。
* (7) 对 Worker 类添加 eqauls 方法
* */
public class Second {
    public static void main(String[] args) {
        Worker worker = new Worker("zhang3",18,3000);
        Worker worker1 = new Worker("li4", 25, 3500);
        Worker worker2 = new Worker("wang5", 22, 3200);
        List<Worker> list = new ArrayList<>();
        list.add(worker);
        list.add(worker1);
        list.add(worker2);
//        在 li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资 3300
        list.add(1,new Worker("zhao6",24,3300));
//        删除 wang5 的信息
        list.remove(2);
//        利用下标遍历，打印输出所有工人信息
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==========================================");
//        利用 forEach 遍历，打印输出所有年龄大于 20 的工人信息
        for (Worker w : list) {
            if (w.getAge()>20)
            System.out.println(w);
        }
        System.out.println("==========================================");
//        利用自遍历的方式，打印输出工人姓名长度大于 6 的信息。
        list.forEach(item->{
            if(item.getName().length()>6){
                System.out.println(item);
            }
        });
    }
}
