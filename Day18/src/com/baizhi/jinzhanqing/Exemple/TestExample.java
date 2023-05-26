package com.baizhi.jinzhanqing.Exemple;

public class TestExample {
    public static void main(String[] args) {
        /*Teacher teacher = new Teacher();
        teacher.setName("ass");
        teacher.setAge(123);
        teacher.setSex('男');
        System.out.println(teacher);*/
        //创建Object对象

/*
//        equals比较
        Object o1 = new Object();
        Object o2 = o1;
        System.out.println(o1 == o2);

        System.out.println(o1.equals(o2));*/

//        Person类使用equals方法进行比较
        Person p = new Person();
        p.age = 12;
        p.name = "ass";
        Person p1 = new Person();
        p1.age = 12;
        p1.name = "ass";
        System.out.println(p == p1);
        System.out.println(p.equals(p1));
    }
}
