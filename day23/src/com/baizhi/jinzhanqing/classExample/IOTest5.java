package com.baizhi.jinzhanqing.classExample;

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 输出流代码
* */
public class IOTest5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/jinzhanqing/机构/day08/a.txt",true);
//        将字节数组的内容进行输出(以追加的方式写出)
        String s = "helloworld";
        byte[] bytes = s.getBytes();
        fileOutputStream.write(bytes);
    }
}
