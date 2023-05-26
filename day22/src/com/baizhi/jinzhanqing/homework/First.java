package com.baizhi.jinzhanqing.homework;

/*
* 1. 编程：创建两个自定义异常类 MyException1 和 MyException2，要求如下：
* (1) MyException1 为已检查异常，MyException2 为运行时异常；
* (2) 这两个异常均具有两个构造函数：一个无参，另一个带字符串参数，参数表示产生异常的信息。
* */
public class First {
    public static void main(String[] args) throws MyException1, MyException2 {
        throw new MyException1("异常信息");
        //throw new MyException2("异常信息");
    }
}
class MyException1 extends Exception{
    public MyException1(){
        super();
    }
    public MyException1(String message){
        super(message);
    }
}
class MyException2 extends Exception{
    public MyException2(){
        super();
    }
    public MyException2(String message){
        super(message);
    }
}
