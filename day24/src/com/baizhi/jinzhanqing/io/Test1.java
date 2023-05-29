package com.baizhi.jinzhanqing.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 关闭流
* */
public class Test1 {
    public static void main(String[] args) throws IOException {
            //读取文件
        FileInputStream fileInputStream = new FileInputStream("worldcup.txt");//如果文件不存在 FileInputStream fileInputStream = null;
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }
            fileInputStream.close();
    }
}
