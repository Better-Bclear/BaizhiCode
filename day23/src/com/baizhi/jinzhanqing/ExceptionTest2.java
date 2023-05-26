package com.baizhi.jinzhanqing;

import java.nio.file.FileAlreadyExistsException;

/*
* 积极处理异常(try catch 捕获异常)
*
* 当出现异常时，执行catch中的代码处理异常，之后程序会继续向下执行
*
* */
public class ExceptionTest2 {
    public static void main(String[] args){
        m1();
        System.out.println("异常处理完成");
    }
    public static void m1() {
        m2(1);
    }
    public static void m2(int i) {
            if (i == 1) {
                //手动产生编译时异常， 必须手动处理
                try {
                    throw new ClassNotFoundException("参数为1");
                }catch (ClassNotFoundException e){
                    //打印异常信息
                    e.printStackTrace();
                }
            }
            if(i==2){
                try {
                    throw new FileAlreadyExistsException("参数不是1");
                }catch (Exception e){
                    //打印异常信息
                    e.printStackTrace();
                }

            }

    }
}
