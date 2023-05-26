package com.baizhi.jinzhanqing.Exemple;

public class Student {
    String name;
    int age;
    String sid;
    int grade;

    public Student(String name, int age, String sid, int grade) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sid='" + sid + '\'' +
                ", grade=" + grade +
                '}';
    }
}
