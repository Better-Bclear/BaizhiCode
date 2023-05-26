package com.baizhi.jinzhanqing.homework;

public class TestMathTool {
    public static void main(String[] args) {
        MathTool mathTool = new MathToolImpl();
        System.out.println(mathTool.fact(10));
        System.out.println(mathTool.intPower(2, 3));
        System.out.println(mathTool.findFactor(99, 2));

    }
}
//MathTool接口
interface MathTool{
    public long fact(int m);
    public long intPower(int m,int n);
    boolean findFactor(int m,int n);
}
class MathToolImpl implements MathTool{

    @Override
    public long fact(int m) {
        long result = 0;
        for (int i = 1; i < m+1; i++) {
            result += i;
        }
        return result;
    }

    @Override
    public long intPower(int m, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= m;
        }
        return result;
    }

    @Override
    public boolean findFactor(int m, int n) {
        return m+n>100;
    }
}
