package com.baizhi.jinzhanqing.classInner;

public class StringTest1 {
    public static void main(String[] args) {
        /*byte[] bs = {65,66,67};
        String s = new String(bs);
        System.out.println(s);*/

        /*char[] c = {'a','b','c'};
        String s = new String(c);
        System.out.println(s);

        c[0] = 'x';
        System.out.println(s);*/

        String s = "sdfhjdhjafjas";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
