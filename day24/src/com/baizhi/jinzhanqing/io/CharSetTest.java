package com.baizhi.jinzhanqing.io;

import java.io.*;

/*
* 缓冲字符流 读取day24\\file\\hello.txt(读取中文乱码)
* */
public class CharSetTest {
    public static void main(String[] args) throws IOException {
        //创建缓冲字符输入流的对象
        BufferedInputStream bufferedReader = new BufferedInputStream(new FileInputStream("day24/file/hello.txt"));
        //读取数据
        int line;
        while((line = bufferedReader.read())!=-1){
            System.out.print((char) line);
        }
        bufferedReader.close();
    }
}
