package com.baizhi.jinzhanqing;

import java.nio.file.FileAlreadyExistsException;

/*
* 方法重写异常的要求
* 假设子类方法抛出的异常类型大于父类方法抛出的异常类型，
* 则在多态的场景下，编译时父类中抛出的异常类型为准进行处理，但是运行时实际抛出的时子类重写之后的异常，如果它抛出的比父类的大
* 则会导致异常的处理代码没有效果
* */
public class ExceptionTest6 {
    public static void main(String[] args) {
        //多态
        Father f = new Son();
        //调用method方法
        try {
            f.method();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Father{
    public void method() throws  FileAlreadyExistsException {
        throw new FileAlreadyExistsException("异常");
    }
}
class Son extends Father{
    //方法重写

    @Override
    public void method() throws FileAlreadyExistsException {
        System.out.println("子类重写的方法");
        throw new FileAlreadyExistsException("文件已存在异常");
    }
}
