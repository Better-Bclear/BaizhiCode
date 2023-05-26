package com.baizhi.jinzhanqing.Example;

public class TestInterface {

}
interface A{
    void m1();
}
interface B{
    void m2();
}
interface C extends A,B{
    void m3();
}
class D implements C{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}
