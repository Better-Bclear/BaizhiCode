package com.baizhi.jinzhanqing.homework;

public class MyClassDemo {
    public static void main(String[] args) {
        Inter i = MyClass.method();
        i.show();
    }
}
interface Inter{
    void show();
}
class MyClass{
    public static Inter method(){
        return ()-> System.out.println("Hello World");
    }
}
