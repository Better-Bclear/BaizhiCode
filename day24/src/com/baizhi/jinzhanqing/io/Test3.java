package com.baizhi.jinzhanqing.io;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 将helloworld写出到file目录下的hello.txt文件中
* 要求对异常进行积极处理 并完成资源的关闭
* */
public class Test3 {
    public static void main(String[] args) {
        //1.在trycatch外定义流变量
        FileOutputStream fileOutputStream = null;
        try {
            //2.在try中赋值
            fileOutputStream = new FileOutputStream("hello.txt");
            //3.写入文件中
            fileOutputStream.write("helloworld".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //3.判断流对象是否为空
            if (fileOutputStream != null){
                try {
                    //4.关闭资源
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    //5.无论是否close成功，在finally中将对象设置为null
                    fileOutputStream = null;
                }
            }
        }
    }
}
