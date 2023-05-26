package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.ArrayList;
import java.util.List;

public class TestStudent{
    public static void main(String[] args) {
        //目前的课程
        Course c1 = new Course (1,"生物");
        Course c2 = new Course (2,"化学");
        Course c3 = new Course (3,"地理");
        Course c4 = new Course (4,"历史");
        Course c5 = new Course (5,"政治");
        Course c6 = new Course (6,"物理");
        //目前的学生和所选择的课程
        Student s1 = new Student("杨颖", 30);
        //1.该学生选择的课程为：生物、化学、物理
        List<Course> list1 = new ArrayList<>();
        list1.add(c1);
        list1.add(c2);
        list1.add(c6);
        s1.setList(list1);
        Student s2 = new Student("郑凯",35);
        //2.该生选择的课程为：化学、历史、物理
        list1.clear();
        list1.add(c2);
        list1.add(c4);
        list1.add(c6);
        s2.setList(list1);
        Student s3 = new Student("邓紫棋", 28);
        s3.setList(list1);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.forEach(System.out::println);
    }
}
