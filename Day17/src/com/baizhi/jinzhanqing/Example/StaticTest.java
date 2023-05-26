package com.baizhi.jinzhanqing.Example;

public class StaticTest {
    public static void main(String[] args) {
        Teacher sc = new Teacher("好册", 23);
        System.out.println(sc);
        Teacher sd = new Teacher("史蒂芬霍金", 33);
        System.out.println(sd);
    }
}
class Teacher{
    String name;
    int age;
    static {
        System.out.println("这是静态代码块");
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
