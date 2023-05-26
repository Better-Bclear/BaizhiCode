package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.*;

/*
* 1. (List)编程：创建一个工人类，属性：姓名、年龄、工资，要求如下：
* (1) 为 Worker 提供无、有参数的构造方法，属性私有，并提供公开的 get/set (2) 创建多个 Worker 类，存储在 List 集合中。
* (3) 打印输出所有的工人信息。
* (4) 计算所有工人的平均工资。
* (5) 打印输出姓名中包含 "胡" 的所有工人信息。
* (6) 打印输出所有姓 "胡" 的工人信息。
* (7) 键盘输入一个姓名，查找是否存在此员工，存在，则打印输出员工的信息， 如果不存在，则输出"查无此人"
* (8) 输入一个工资，查询工资 大于 输入工资的员工信息。
* */
public class First {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        Worker worker1 = new Worker("胡人1号", 23, 4000.0);
        Worker worker2 = new Worker("工人2号", 25, 2500.0);
        Worker worker3 = new Worker("工人3号", 27, 5000.0);
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);
//        累加器
        double sum = 0;

//        循环遍历
        for (Worker w :
                list) {
//            输出每个对象
            System.out.println(w);
//            累加工资
            sum += w.getSalary();
        }
        System.out.println("==========================================");
        System.out.println("工资的平均值为："+sum / list.size());
        System.out.println("==========================================");
//        是否姓胡
        for (Worker w :
                list) {
//            判断是否姓胡，是则输出
            if (w.getName().startsWith("胡"))
            System.out.println("姓胡的员工为："+w);
        }
        System.out.println("==========================================");

        for (Worker w :
                list) {
//            判断是否包含胡，是则输出
            if (w.getName().contains("胡"))
                System.out.println("名字中包含胡的员工为："+w);
        }
        System.out.println("情输入要查找的人的姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        List<Worker> list1 = new ArrayList<>();
        for (Worker w :
                list) {
//            判断姓名是否一样
            if (w.getName().equals(name))
//                System.out.println("名字相同的员工为："+w1);
                list1.add(w);
        }
        if (list1.size()==0){
            System.out.println("查无此人");
        }else{
            list1.forEach(System.out::println);
        }
//        输入一个工资，查询工资 大于 输入工资的员工信息
        System.out.println("请输入工资");
        double s = scanner.nextDouble();
        list.forEach(worker -> {
            if (worker.getSalary()>s)
                System.out.println(worker);

        });
    }
}

