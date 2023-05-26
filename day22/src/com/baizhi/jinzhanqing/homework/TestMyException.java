package com.baizhi.jinzhanqing.homework;
/*
*
* */
public class TestMyException {
    public static void main(String args[]) throws MyException2 {
        int n;
        //读入n
        n=2;
        try {
            m(n);
        } catch (MyException1 ex1) {
            //输出ex1 详细的方法调用栈信息
            ex1.printStackTrace();
        } catch (MyException2 ex2) {
            //输出ex2的详细信息
            ex2.printStackTrace();
            // 并把ex2重新抛出
            throw ex2;
        }

    }
    public static void m(int n) throws MyException1, MyException2 {
        if (n == 1) {
            throw new MyException1("n==1");
        } else {
            throw new MyException2("n==2");
        }
    }
}