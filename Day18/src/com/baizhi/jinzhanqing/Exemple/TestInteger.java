package com.baizhi.jinzhanqing.Exemple;

public class TestInteger {
    public static void main(String[] args) {
/*//        输出Integer的最大最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
//        输出Byte的最大最小值
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
//        创建Integer对象
        Integer i = new Integer(5);
//        重写了toString方法
        System.out.println(i);//输出5
//        通过字符串创建Integer对象，必须是能转换成数字的字符串
        Integer i3 = new Integer("2333");
        System.out.println(i3);*/

        //在缓冲区
        Integer i1 = 190;
        Integer i2 = 190;
        System.out.println(i1 == i2);
        //不在缓冲区
        Integer i3 = 10;
        Integer i4 = 10;
        System.out.println(i3 == i4);
    }
}
