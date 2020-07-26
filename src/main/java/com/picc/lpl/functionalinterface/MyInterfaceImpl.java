package com.picc.lpl.functionalinterface;

public class MyInterfaceImpl implements MyInterface {

    @Override
    public void test() {
        System.out.println("子类重写的test方法");
    }

//    @Override
//    public void test3() {
//        System.out.println("子类重写的test3方法");
//    }
}
