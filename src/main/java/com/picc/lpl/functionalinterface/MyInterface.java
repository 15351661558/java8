package com.picc.lpl.functionalinterface;


@FunctionalInterface
public interface MyInterface {

    void test();

    //void test2();

    default void test3(){
        System.out.println("test3");
    }

    static void test4(){
        System.out.println("test4");
    }


}
