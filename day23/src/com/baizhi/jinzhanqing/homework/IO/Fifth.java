package com.baizhi.jinzhanqing.homework.IO;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Fifth {
    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("worldcup.txt"), "gbk");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            Map<Integer,String> map = new HashMap<>();
            String s;
            while ((s = bufferedReader.readLine())!=null){
                String[] ss = s.split("/");
                map.put(Integer.parseInt(ss[0]),ss[1]);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入年份");
            AtomicBoolean a = new AtomicBoolean(false);
            int year = scanner.nextInt();
            map.forEach((k,v)->{
                if (year == k) {
                    System.out.println(v);
                    a.set(true);
                }
            });
            if(!a.get()){
                System.out.println("没有举办世界杯");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
