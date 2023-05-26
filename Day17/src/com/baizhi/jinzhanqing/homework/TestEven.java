package com.baizhi.jinzhanqing.homework;

import java.util.Scanner;

public class TestEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于6的偶数");
        int i1 = scanner.nextInt();
        TestEven testEven = new TestEven();
        for (int i = 2; i <=  i1/2; i++) {
            if (testEven.judgeEven(i)&& testEven.judgeEven(i1-i)){
                System.out.println("两个数都是质数："+i+"+"+(i1-i)+"="+i1);
            }
        }
    }
    public boolean judgeEven(int k){
        for (int i = 2; i < k ; i++) {
            if (k%i == 0){
                return false;
            }
        }
        return true;
    }
}
