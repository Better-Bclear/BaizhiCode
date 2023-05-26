package com.baizhi.jinzhanqing;
/*
* 小王开店，但是中间生病了
* */
public class ExceptionTest5 {
    public static void main(String[] args) {
        work(true);
    }
    //sick==true生病
    public static void work(boolean sick){
        try {
            System.out.println("开店门");
            System.out.println("开始工作");
            if (sick) {
                throw new RuntimeException("小王生病");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("被120拉走了");
        }finally {
            System.out.println("关店");
        }
    }
}
