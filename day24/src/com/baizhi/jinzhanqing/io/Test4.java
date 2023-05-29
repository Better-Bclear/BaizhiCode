package com.baizhi.jinzhanqing.io;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 设置写出到文件的字符编码
* */
public class Test4 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            //写出汉字  中
            fileOutputStream = new FileOutputStream("day24//file//chinese.txt");
            /*
            * 实际写出的是-
            * 原因：1.文件字节输出流write(int i)会写出一个字节
            * 2.'a','A'等在ASCII中 - 1个字节存储
            * '中' - 2个字节 GBK
            * '中' - 3个字节 UTF-8
            * */
            fileOutputStream.write("中".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream != null) {
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
