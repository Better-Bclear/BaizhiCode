package com.baizhi.jinzhanqing.homework.Exception;

public class Tenth {
    public static void main(String[] args) {
        try{
            m1(0);
        }catch (NullPointerException e){
            System.err.println("发生运行时异常");;
        }catch (RuntimeException e){
            System.err.println("父类也会输出");
        }

    }
    public static void m1(int i) {
            throw new NullPointerException();
    }
}
