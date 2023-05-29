package com.baizhi.jinzhanqing.homework.Exception;

/*
* 自定义异常：继承运行时异常父类，并实现构造方法
*
* */
public class MyException2 extends RuntimeException{
    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }
}
