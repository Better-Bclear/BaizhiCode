package com.baizhi.jinzhanqing.homework.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 2. 编程：利用 IO 流，完成以下程序：
* (1) 将 26 个大写字母(A~Z)写入到当前项目 a.txt 文件中;
* (2) 读取文件中的内容，将读取的内容连接为一个字符串，并将所有的大写字母转变为小写字母打印 输出转换的结果
* */
public class Second {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("a.txt", true);
//            (1) 将 26 个大写字母(A~Z)写入到当前项目 a.txt 文件中;
            for (int i = 65; i < 91; i++) {
                fileOutputStream.write((char)i);
            }
//            (2) 读取文件中的内容，将读取的内容连接为一个字符串，并将所有的大写字母转变为小写字母打印 输出转换的结果
            FileInputStream fileInputStream = new FileInputStream("a.txt");
            int i;
            while ((i = fileInputStream.read())!=-1){
                System.out.print((char)(i+32));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
