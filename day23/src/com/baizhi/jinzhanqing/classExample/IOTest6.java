package com.baizhi.jinzhanqing.classExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 输出流代码
* */
public class IOTest6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/jinzhanqing/机构/day08/a.png");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/jinzhanqing/机构/day08/b.png",true);
        int i;
        while ((i=fileInputStream.read())!=-1){
            fileOutputStream.write(i);
        }

    }
}
