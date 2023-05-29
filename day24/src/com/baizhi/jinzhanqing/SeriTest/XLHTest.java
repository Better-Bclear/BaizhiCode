package com.baizhi.jinzhanqing.SeriTest;

import java.io.*;
/*
* 序列化Student对象
* */
public class XLHTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建student对象
        Student s1 = new Student("张三", 18);
        //创建输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
        //创建序列化的流对象
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
        //将student对象序列化并持久化
        out.writeObject(s1);

    }
}
