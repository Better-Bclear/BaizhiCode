package com.baizhi.jinzhanqing.classExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("/Users/jinzhanqing/机构/day08/TestEmployee.java");
        int read;
        while((read = f.read())!=-1){

            if ((char) read == '{'||(char) read == '}'||(char) read == '('||(char) read == ')') {
                System.out.println((char) read);
            }else {
                System.out.print((char) read);
            }
            read = f.read();

        }
    }
}
