package com.baizhi.jinzhanqing.classExmaple;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 输出流代码
* */
public class TestFileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("x.txt");
            System.out.println(fin.read());
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
