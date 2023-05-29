package com.baizhi.jinzhanqing.io;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //创建缓冲字节输入流的对象
            bufferedInputStream = new BufferedInputStream(new FileInputStream("day24//file//b.txt"));
            //创建缓冲字节输出流的对象
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("day24//file//x.txt"));
            int i;
            System.out.println();
            while((i = bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                bufferedInputStream = null;
                bufferedOutputStream = null;
            }
        }

    }
}
