package com.baizhi.jinzhanqing.homework.IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
* 事先在当前目录下准备好一个 test.txt 的文本文件，要求该文本文件是使用 GBK 编码的多行文本文 件。如 test.txt ：
* 窗前明月光
* 疑是地上霜
* 举头望明月
* 低头思故乡
* 利用字节流+桥转换读入这个文本文件，按照行的顺序，以 UTF-8 编码方式，写到 test2.txt 文件中。
* */
public class Forth {
    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("test.txt"), "gbk");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileOutputStream fileOutputStream = new FileOutputStream("test2.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8));
            List<String> list = new ArrayList<>();
            String s;
            while ((s = bufferedReader.readLine())!=null){
                list.add(s);
            }
            Collections.reverse(list);
            for (String string : list) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
