package com.baizhi.jinzhanqing.classExample;

import java.io.File;

public class TestMyFile {
    public static void main(String[] args) throws Exception{
        File file;
        file = new File("hello.txt");
        if(file.exists()){
            System.out.println(file.getAbsolutePath());
        }
    }
}
