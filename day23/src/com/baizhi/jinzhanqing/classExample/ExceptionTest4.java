package com.baizhi.jinzhanqing.classExample;

import java.util.Scanner;
/*
* 请输入第一个数
* 3
* 请输入第二个数
* 0
* Exception in thread "main" java.lang.ArithmeticException: / by zero
* at com.baizhi.jinzhanqing.Exception4.div(Exception4.java:16)
* at com.baizhi.jinzhanqing.Exception4.main(Exception4.java:12)
* */
public class ExceptionTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int i = scanner.nextInt();
        System.out.println("请输入第二个数");
        int i1 = scanner.nextInt();
        int res = div(i, i1);
        System.out.println("结果为：" + res);
    }
    public static int div(int m,int n){
        try {
            return m / n;
        }catch (ArithmeticException e){
            e.printStackTrace();
            return -1;
        }finally {
            System.out.println("无论是否产生异常都会执行");
        }
    }
}

