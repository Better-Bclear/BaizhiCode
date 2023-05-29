package com.baizhi.jinzhanqing.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class Test5shenhaonan {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter out = new OutputStreamWriter(
                new FileOutputStream("hello.txt",true),
                "GBK");
        BufferedWriter writer = new BufferedWriter(out);
        //写出数据
        writer.write("我爱你中国");
        writer.flush();
        //关闭流
        writer.close();
    }
}
