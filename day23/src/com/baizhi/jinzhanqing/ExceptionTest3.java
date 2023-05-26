package com.baizhi.jinzhanqing;

import java.nio.file.FileAlreadyExistsException;

public class ExceptionTest3 {
    public static void main(String[] args){
        m1();
        System.out.println("异常处理完成");
    }
    public static void m1() {
        m2(1);
    }
    public static void m2(int i) {
        try {
            if (i == 1) {
                //手动产生编译时异常， 必须手动处理
                throw new ClassNotFoundException("参数为1");
                //打印异常信息
            }
            if (i == 2) {
                throw new FileAlreadyExistsException("参数不是1");
                //打印异常信息

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
