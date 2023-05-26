package com.baizhi.jinzhanqing;

/*
* 自定义编译时异常：继承Exception，并添加构造方法
* */
public class MyException1 extends Exception{
    public MyException1() {
    }

    public MyException1(String message) {
        super(message);
    }

}
