package com.baizhi.jinzhanqing.classExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

/*
* 自己动手写出字符输入流
* */
public class IOTest2 implements Serializable {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/jinzhanqing/机构/day08/a.txt");
        int i;
        while((i = fileReader.read())!=-1){
            System.out.print(i);
            System.out.println();
        }
    }
}
