package com.baizhi.jinzhanqing.homework;
/*(1) 在//1 处使用局部内部类技术，调用 lamp 的 on 方法要求输出”shine in red”
(2) 在//2 处使用匿名内部类技术，调用 lamp 的 on 方法要求输出”shine in yellow”
(3) 在//3 处使用 Lambda 技术，调用 lamp 的 on 方法要求输出”shine in green”
* */
public class TestLamp {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        //1
        lamp.on(new Light() {
            @Override
            public void shine() {
                System.out.println("shine in red");
            }
        });
        //2
        lamp.on(new Light() {
            @Override
            public void shine() {
                System.out.println("shine in red");
            }
        });
        lamp.on(()->System.out.println("shine in green"));
    }
}
interface Light{
    void shine();
}
class Lamp{
    public void on(Light light){
        light.shine();
    }
}
