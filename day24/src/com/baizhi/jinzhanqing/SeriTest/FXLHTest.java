package com.baizhi.jinzhanqing.SeriTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
* 反序列化Student对象
* */
public class FXLHTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建输入流
        FileInputStream fileInputStream = new FileInputStream("student.txt");
        //创建反序列化的对象
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        //反序列化
        Student s2 = (Student) in.readObject();
        //输出对象
        System.out.println(s2);
    }
}
