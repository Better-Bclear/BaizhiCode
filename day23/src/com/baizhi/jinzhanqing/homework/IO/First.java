package com.baizhi.jinzhanqing.homework.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 1. 编程：利用 FileInputStream 和 FileOutputStream，完成下面的要求：
* (1) 用 FileOutputStream 往当前目录下“test.txt”文件中写入“Hello World”；
* (2) 利用 FileInputStream 读入 test.txt 文件，并在控制台上打印出 test.txt 中的内容。
* (3) 要求应用积极方式处理异常。
*
* */
public class First {
    public static void main(String[] args) {
        try {
//            (1) 用 FileOutputStream 往当前目录下“test.txt”文件中写入“Hello World”;
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
            String s = "Hello World";
            byte[] bytes = s.getBytes();
            fileOutputStream.write(bytes);
//            (2) 利用 FileInputStream 读入 test.txt 文件，并在控制台上打印出 test.txt 中的内容。
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            int i;
            while((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
