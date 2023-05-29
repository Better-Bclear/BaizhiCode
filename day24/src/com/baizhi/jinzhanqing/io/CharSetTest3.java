package com.baizhi.jinzhanqing.io;

import java.io.*;

/*
* 使用转换流写出文件
* */
public class CharSetTest3 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("day24/file/hello.txt"),"gbk");
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("我爱你中国");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
