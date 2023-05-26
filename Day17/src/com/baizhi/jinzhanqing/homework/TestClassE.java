package com.baizhi.jinzhanqing.homework;
public class TestClassE{
    public static void main(String[] args) {
        IC ic = new ClassE();
        ic.mc();
        ID id = (ID) ic;
        id.mb();
        id.mc();
        id.md();
    }
}

class ClassE implements ID{
    @Override
    public void ma() {
        System.out.println("ClassE中的ma方法");
    }

    @Override
    public void mb() {
        System.out.println("ClassE中的mb方法");
    }

    @Override
    public void mc() {
        System.out.println("ClassE中的mc方法");
    }

    @Override
    public void md() {
        System.out.println("ClassE中的md方法");
    }
}

interface IA{
    void ma();
}
interface IB extends IA{
    void mb();
}
interface IC{
    void mc();
}
interface ID extends IB,IC{
    void md();
}
/*
* true
* true
* true
* true
* true
* */