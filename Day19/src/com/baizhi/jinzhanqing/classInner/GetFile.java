package com.baizhi.jinzhanqing.classInner;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class GetFile {
    public static void main(String[] args) {
        File file = new File("/Users/jinzhanqing/机构/day18/金湛清/TestPerson.java");
        //System.out.println(file.getName());

        //获取用户输入的身份证并输出该用户所在的省份
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户的身份证号");
        String id = scanner.next();
        if (id.startsWith("11")){
            System.out.println("北京");
        }
        if (id.startsWith("12")){
            System.out.println("天津");
        }
        if (id.startsWith("13")){
            System.out.println("河北");
        }*/
        //验证码equalsIgnoreCase
        /*Scanner scanner = new Scanner(System.in);
        String str = "2A3d";
        System.out.println("验证码:"+str);
        System.out.println("请输入验证码");
        String str1 = scanner.next();
        if (str1 == null||!str1.equalsIgnoreCase(str)){
            System.out.println("请输入正确的验证码");
        }else{
            System.out.println("验证通过");
        }*/
        //字符位置IndexOf
        /*String s = "2acabad";
        //a字符第一次出现的下标
        int firstIndex = s.indexOf('a');
        //a字符最后一次出现的下标
        int lastIndex = s.lastIndexOf('a');
        System.out.println("a第一次出现的下标为：" + firstIndex);
        System.out.println("a最后一次出现的下标为：" + lastIndex);*/
        //字符串位置IndexOf
        /*
        //查找字符串abc第一次和最后一次出现的位置
        String s = "xabcabcabc";
        //abc字符第一次出现的下标
        int firstIndex = s.indexOf("abc");
        //a字符最后一次出现的下标
        int lastIndex = s.lastIndexOf("abc");
        System.out.println("abc第一次出现的下标为：" + firstIndex);
        System.out.println("abc最后一次出现的下标为：" + lastIndex);
        */
        //字符串的替代replace
        /*
        String str = "abc111abc333c3444abc";
        String s1 = str.replace('a', 'x');
        System.out.println(s1);

        String x = str.replaceAll("\\d", "x");
        System.out.println(x);*/
        //字符串的切割splite
        /*String[] split = file.getName().split("\\.");
        Arrays.stream(split).forEach(System.out::println);*/
        //字符串的截取subString
        /*String str = "HelloWorld";
        String s1 = str.substring(5);
        System.out.println(s1);
        String s2 = str.substring(0, 5);
        System.out.println(s2);
        //练习：获取用户输入的身份证号，根据身份证好输出用户的出生日期
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身份证号");
        String next = scanner.next();
        System.out.println("出生年份："+next.substring(6, 10));
        System.out.println("出生月份："+next.substring(10, 12));
        System.out.println("出生日期："+next.substring(12, 14));*/
        //字符串转换大小写toLowerCase/toUpperCase
        /*String str = "aBdjsBsE";
        String s = str.toUpperCase();
        System.out.println(s);
        String s1 = str.toLowerCase();
        System.out.println(s1);*/
        //去除字符串中开头和结尾的空格trim
        /*String str = "   abc   xyz   ";
        String trim = str.trim();
        System.out.println(trim);*/
        //将int类型转换为字符串类型value
        /*int i = 5;
        String s = String.valueOf(5);
        System.out.println(s.getClass().getName());*/
        //使用StringBuilder和StringBuffer拼接对象
        //String拼接对象所用的时长
        long start = System.currentTimeMillis();
        String str = "hello";
        for (int i = 0; i <= 3000; i++) {
            str = str+i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String拼接字符串所花费的时间为："+(end - start)+"毫秒");

        long start1 = System.currentTimeMillis();
        StringBuilder hello = new StringBuilder("hello");
        for (int i = 0; i <= 3000; i++) {
            hello.append(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("StringBuilder拼接字符串所花费的时间为："+(end1 - start1)+"毫秒");

        long start2 = System.currentTimeMillis();
        StringBuffer hello1 = new StringBuffer("hello");
        for (int i = 0; i <= 3000; i++) {
            hello1.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuffer拼接字符串所花费的时间为："+(end2 - start2)+"毫秒");
    }
}
