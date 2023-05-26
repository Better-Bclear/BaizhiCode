package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.*;

/*
* 3. (Set)编程：创建一个商品(Product)类,属性：商品名，商品单价，商品的数量，商品产地。
* (1) 创建多个商品对象，存储在 Set 集合中，集合中不能出现重复商品，商品名相同即为重复，在 Product 类中添加必要的方法；
* (2) 显示所有的商品信息；
* (3) 打印输出商品价格 > 1000 的所有商品信息；
* (4) 打印售空的商品的信息；
* (5) 打印输出商品产地为"北京"的商品信息；
* (6) 输入一个商品名，查询出此类商品的信息，如果不存在，则打印商品"商场无此商品！！！"
* (7) 输入一个价格段，查询出集合中所有在这个价格区间的所有商品信息。
* */
public class Third {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        set.add(new Product("aaa",2300,200,"江苏"));
        set.add(new Product("aaa",2500,600,"浙江"));
        set.add(new Product("bbb",4500,0,"北京"));
        set.add(new Product("ccc",3000,600,"天津"));
//        显示所有商品信息
        System.out.println("打印所有商品");
        set.forEach(System.out::println);
//        打印输出商品价格 > 1000 的所有商品信息；
        System.out.println("商品价格大于1000的商品信息为：");
        set.forEach(product->{
            if (product.getPrice()>1000){
                System.out.println(product);
            }
        });
        System.out.println("==========================================");
//        打印售空的商品的信息
        System.out.println("售空的商品的信息为：");
        set.forEach(product -> {
            if(product.getCount()==0){
                System.out.println(product);
            }
        });
//        打印输出商品产地为"北京"的商品信息
        System.out.println("打印输出商品产地为\"北京\"的商品信息：");
        set.forEach(product -> {
            if(product.getAddress().equals("北京")){
                System.out.println(product);
            }
        });
        System.out.println("==========================================");
//        输入一个商品名，查询出此类商品的信息，如果不存在，则打印商品"商场无此商品！！！"
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名");
        String name = scanner.next();
        List<Product> list = new ArrayList<>();
        set.forEach(product -> {
            if(product.getProductName().equals(name)){
                list.add(product);
            }
        });
        if (list.size()>0){
            list.forEach(System.out::println);
        }else{
            System.out.println("商场无此商品！！！");
        }
        System.out.println("==========================================");
//        输入一个价格段，查询出集合中所有在这个价格区间的所有商品信息。
        System.out.println("请输入一个价格段（格式：最低价~最高价）");
        String priceField = scanner.next();
        String[] s = priceField.split("~");
        double min = Double.parseDouble(s[0]);
        double max = Double.parseDouble(s[1]);
        System.out.println("在此价格区间内的商品有：");
        set.forEach(product -> {
            if (product.getPrice()>=min&&product.getPrice()<=max){
                System.out.println(product);
            }
        });

    }
}
