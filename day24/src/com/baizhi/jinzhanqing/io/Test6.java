package com.baizhi.jinzhanqing.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* 通过字符输入流读取文件b.txt中的第一个字符
* */
public class Test6 {
    public static void main(String[] args) {
        //创建字符输入流对象
        FileReader fileReader = null;
        try {
            //给流对象赋值
            fileReader = new FileReader("day24//file//b.txt");
            //读取第一个字符
            //int read = fileReader.read();
            // System.out.println((char) read);
            //读取所有字符
            int i;
            while ((i = fileReader.read())!=-1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流
                try {
                    if (fileReader != null) {
                        fileReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    fileReader = null;
                }

        }
    }
}
