package com.baizhi.jinzhanqing;

/*
* 将异常抛出的一个简单的例子
*
* */
public class ExceptionTest {
    public static void main(String[] args) throws ClassNotFoundException{
        ExceptionTest exceptionTest = new ExceptionTest();
        exceptionTest.m1();
    }
    public void m1() throws ClassNotFoundException {
        m2(1);
    }
    public void m2(int i) throws ClassNotFoundException {
        if(i==1){
            throw new ClassNotFoundException("参数为1");
        }else{
            throw new ClassNotFoundException("参数不是1");
        }
    }
}
