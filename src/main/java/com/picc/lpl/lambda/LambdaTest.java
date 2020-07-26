package com.picc.lpl.lambda;

public class LambdaTest {


    public static void main(String[] args) {
        System.out.println("main线程执行");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程执行");
            }
        }).start();

        //lambda表达式 ()->{}
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"线程执行");
        }).start();



    }

}
