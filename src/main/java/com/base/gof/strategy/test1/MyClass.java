package com.base.gof.strategy.test1;

/**
 * @author lhh
 * @date 2019/6/10 9:53
 * @Description:
 */
public class MyClass {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyInterface myInterface = new InsertCode1();
        myClass.myMethod(myInterface);

    }

    public void myMethod() {
        System.out.println("方法里的代码1");
        //LZ想在这插入一段代码，而且这个代码是可以改变的，想怎么变就怎么变
        System.out.println("方法里的代码2");
    }

    public void myMethod(MyInterface myInterface) {
        System.out.println("方法里的代码1");
        //你看我是不是插进来一段代码？而且这段代码是可以随便改变的
        myInterface.insertCode();
        System.out.println("方法里的代码2");
    }
}

class InsertCode1 implements MyInterface {
    public void insertCode() {
        System.out.println("我想插进去的代码，第一种");
    }

}

class InsertCode2 implements MyInterface {
    public void insertCode() {
        System.out.println("我想插进去的代码，第二种");
    }

}
