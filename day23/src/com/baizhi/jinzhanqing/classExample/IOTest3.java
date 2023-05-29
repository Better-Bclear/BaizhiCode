package com.baizhi.jinzhanqing.classExample;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
* 自己动手写出字符输入流
* */
public class IOTest3 {
    public static void main(String[] args) throws IOException {
        //InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("/Users/jinzhanqing/机构/day08/a.txt"), StandardCharsets.UTF_8);
        FileInputStream fileReader = new FileInputStream("/Users/jinzhanqing/机构/day08/a.txt");
        //读取数据
        //读取数据的容量 数组每次读取玩不会清空 而是用新的数据进行覆盖
        byte[] bs = new byte[10];
        int i;
        while((i = fileReader.read(bs))!=-1){
            String s = new String(bs,0,i);
//            将字节数组的内容转为字符再拼接成字符串
//            创建字符串的对象接受结果并进行输出
            System.out.print(s);
        }
    }
}
