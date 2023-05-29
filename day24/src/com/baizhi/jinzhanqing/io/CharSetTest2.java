package com.baizhi.jinzhanqing.io;

import java.io.*;
/*
* 转换流 - 字节转换流读入文件并输出
* */
public class CharSetTest2 {
    public static void main(String[] args) throws IOException {

        //创建转换输入流的对象
        InputStreamReader in = new InputStreamReader(new FileInputStream("day24/file/hello.txt"),"gbk");
        BufferedReader bufferedReader = new BufferedReader(in);
        //准备一个字节数组
        String  line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
            System.out.println();
        }
        //字节数组转换成字符串
        in.close();
    }
}
