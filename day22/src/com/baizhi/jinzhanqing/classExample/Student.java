package com.baizhi.jinzhanqing.classExample;

import java.util.Objects;

public class Student {
    private int sid;
    private String name;
    private int age;
    private char sex;

    public Student() {
    }

    public Student(int sid, String name, int age, char sex) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
