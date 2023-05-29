package com.baizhi.jinzhanqing.io;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        //BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;
        try {
            //创建缓冲字符输入流的类
            bufferedReader = new BufferedReader(new FileReader("day24//file//b.txt"));
            //创建缓冲字符输出流的类
            //bufferedWriter = new BufferedWriter(new FileWriter("day24//file//v.txt"));
            printWriter = new PrintWriter(new FileWriter("day24//file//v.txt"));
            String line;
            //在读入的同时写出数据
            while((line = bufferedReader.readLine())!=null){
                //写出数据
                //bufferedWriter.write(line);
                printWriter.println(line);
                //换行
                //bufferedWriter.newLine();
            }
            //把数据从缓冲区中刷出来
            //bufferedWriter.flush();
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
                try {
                    /*if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }*/
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    if (bufferedReader != null){
                        bufferedReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    bufferedReader = null;
                    //bufferedWriter = null;
                    printWriter = null;
                }

        }
    }
}
