package com.baizhi.jinzhanqing.io;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 将helloworld写出到file目录下的hello.txt文件中
* 要求对异常进行积极处理 并完成资源的关闭
* */
public class Test3 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("hello.txt");
            fileOutputStream.write("helloworld".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    fileOutputStream = null;
                }
            }
        }
    }
}
