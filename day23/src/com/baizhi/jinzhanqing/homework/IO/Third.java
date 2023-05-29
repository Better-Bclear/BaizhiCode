package com.baizhi.jinzhanqing.homework.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
* 3. 编程：当前项目的根目录 c.txt 文件中的内容为”abddbskshlsjdhhhiw”;
* 编写程序读取文件中的内容，要求去除重复的字母并按照字母的自然排序后将内容写入到当前项目的根目录 d.txt 文件中。
* */
public class Third {
    public static void main(String[] args) {
        Set<Character> set = new TreeSet<>();
        try {
//            编写程序读取文件中的内 容，要求去除重复的字母
            FileInputStream fileInputStream = new FileInputStream("c.txt");
            int i;
            while ((i= fileInputStream.read())!=-1){
                set.add((char)i);
            }
            FileOutputStream fileOutputStream = new FileOutputStream("d.txt");
            set.forEach(item->{
                try {
                    fileOutputStream.write(item);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
