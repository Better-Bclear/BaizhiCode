package com.baizhi.jinzhanqing.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* 将b.txt复制为c.txt
* */
public class CopyFile {
    public static void main(String[] args) {
        //1.创建输入流和输出流对象
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //2.给两个流对象赋值
            fileReader = new FileReader("day24//file//b.txt");
            fileWriter = new FileWriter("day24//file//c.txt");
            int i;
            //3.循环读入字符并同时写出
            while ((i = fileReader.read())!=-1){
                fileWriter.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.关流
            try{
                if (fileWriter != null) {
                    fileWriter.close();
                }
                if (fileReader != null){
                    fileReader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                fileReader = null;
                fileWriter = null;
            }
        }
    }
}
