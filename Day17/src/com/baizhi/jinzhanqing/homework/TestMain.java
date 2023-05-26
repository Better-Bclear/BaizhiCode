package com.baizhi.jinzhanqing.homework;

abstract class Animal {
    public abstract void eat();
}

interface Pet {
    void play();
}
class Dog extends Animal implements Pet {
    public void eat() {
        System.out.println("Dog eat Bones");
    }

    public void play() {
        System.out.println("Play with Dog");
    }
}
class Cat extends Animal implements Pet {
    public void eat() {
        System.out.println("Cat eat fish");
    }

    public void play() {
        System.out.println("Play with Cat");
    }
}
class Wolf extends Animal {
    public void eat() {
        System.out.println("Wolf eat meat");
    }
}
public class TestMain{
    public static void main (String args[]) {
        //1.定义一个Animal类型a数组，存储多个不同子类型对象
        //2.调用ag数组中所有动物的eat 方法
        //3. 統计数组中宠物的个数
        //4. 调用as数组中所有宠物的play方法
        Animal[] as = new Animal[3];
        as[0] = new Dog();
        as[1] = new Cat();
        as[2] = new Wolf();
        //宠物的个数
        int sum = 0;
        for (Animal a :
                as) {
            //输出所有动物的eat方法
            a.eat();
            if (a instanceof Pet){
                ((Pet) a).play();//调用所有宠物的play方法
                sum++;
            }
        }
//        输出所有宠物的个数
        System.out.println(sum);
    }
}