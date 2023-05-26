package com.baizhi.jinzhanqing.classExample;

import java.util.HashMap;
import java.util.Map;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(1, "张三", 18, '男');
        Student student1 = new Student(2,"李四",25,'男');
        Student student2 = new Student(3,"王五",22,'女');
        Student student3 = new Student(4,"张六",24,'男');
        Map<Integer,Student> map = new HashMap<>();
        map.put(student.getSid(),student);
        map.put(student1.getSid(),student1);
        map.put(student2.getSid(),student2);
        map.put(student3.getSid(),student3);
        map.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
        System.out.println("====================================");
        map.forEach((k,v)->{
            if (v.getSex()=='女'){
                System.out.println(k+":"+v);
            }
        });
    }
}
