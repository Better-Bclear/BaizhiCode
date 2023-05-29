package com.baizhi.jinzhanqing.homework;

import java.io.*;
import java.util.Scanner;

/*
*
* 20. 编程：综合题 从命令行中读入一个文件名，判断该文件是否存在。如果该文件存在，则在原文件相同路径下创建一个 文件名为“copy_原文件名”的新文件，该文件内容为原文件的拷贝。
* 例如：读入 home/java/photo.jpg 则创建一个文件 home/java/copy_photo.jpg 新文件内容和原文件内 容相同。
* */
public class Twentieth {
    public static void main(String[] args) {
        System.out.println("请输入文件名");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        File file = new File(next);
        if (file.exists()) {
            File file1 = new File(file.getAbsolutePath());
            String parent = file1.getParent();
            String newName = parent + "/copy_" + next;
            File file2 = new File(newName);
            try {
                file2.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file),"gbk");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2));
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }
                bufferedReader.close();
                bufferedWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
