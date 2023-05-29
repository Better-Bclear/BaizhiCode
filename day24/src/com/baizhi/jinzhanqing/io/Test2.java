package com.baizhi.jinzhanqing.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            //读取文件
            fileInputStream = new FileInputStream("worldcup.txt");//如果文件不存在 FileInputStream fileInputStream = null;
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }

            /*
             * 两个异常不能调换位置，如果将父类放到前面则发生父类的异常后不会捕获子类的异常，后面的代码不会执行
             * */
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream == null) {//避免空指针异常
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                fileInputStream = null;//流对象没有使用资源关闭
            }

        }
    }
}
