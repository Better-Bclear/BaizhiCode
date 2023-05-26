package com.baizhi.jinzhanqing;

public class MyExceptionTest {
    public static void main(String[] args) {
        printAge(-11);
    }
    public static void printAge(int age){
        if (age<0){
            try {
                throw new MyException1("年龄值不能小于0");
            } catch (MyException1 myException1) {
                myException1.printStackTrace();
            }
        }
        System.out.println(age);
    }
}
