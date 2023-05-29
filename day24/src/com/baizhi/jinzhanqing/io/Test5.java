package com.baizhi.jinzhanqing.io;

import java.io.FileWriter;
import java.io.IOException;

/*
* 使用字符流写出中文
* */
public class Test5 {
    public static void main(String[] args) throws IOException {
        //1.创建字符输出流的对象
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("day24//file//b.txt");
            fileWriter.write("中");
            fileWriter.write("国");
            //关闭流 - 关流之前会将缓冲区中的数据写入到文件中
            //fileWriter.close();
            //将缓冲区中的数据刷到文件中
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

                try {
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        fileWriter = null;
                    }
                }

        }
    }
}

