package com.baizhi.jinzhanqing.path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//相对路径
public class PathTest {
    public static void main(String[] args) throws IOException {
        //相对路径
        /*
        * 在idea中相对路径指的是相对项目目录而言的
        * */
        FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
        fileOutputStream.write("abc".getBytes());

        //读取words.txt的内容
        //绝对路径
        //FileInputStream fileInputStream = new FileInputStream("/Users/jinzhanqing/工作区/BaizhiCode/worldcup.txt");
        //相对路径-相对当前项目而言的
        FileInputStream fileInputStream = new FileInputStream("worldcup.txt");

        int i;
        while((i=fileInputStream.read())!=-1){
            System.out.print((char) i);
        }
    }
}
