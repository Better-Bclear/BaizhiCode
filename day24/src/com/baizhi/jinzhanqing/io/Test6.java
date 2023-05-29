package com.baizhi.jinzhanqing.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* 通过字符输入流读取文件b.txt中的第一个字符
* */
public class Test6 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("day24//file//b.txt");
            int read = fileReader.read();
            System.out.println((char) read);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
