package com.company;
import java.lang.*;
import java.lang.Override;
import java.util.Scanner;

public class TestThreadTwo {

    public static void main(String arge[]){
        /*
        //现承保护setDaemon
        Thread t=new Thread(new ThreadDamo());
        t.setName("另一条线程");
        t.setDaemon(true);//在start()前面用
        t.start();

        try{
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("保护线程结束");
        */




        /*
        //强制执行线程join
        int n=0;
        Thread t=new Thread(new ThreadJoin());
        t.setName("新线程");
        for (int i=0;i<5;i++){
            if (i==3){
                try {
                    t.start();
                    t.join();

                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("主线程"+n++);
            */




        //同步代码块的使用
        TestThreadSynchronized testThreadSynchronized=new TestThreadSynchronized();
        new Thread(testThreadSynchronized).start();
        new Thread(testThreadSynchronized).start();
        new Thread(testThreadSynchronized).start();
        new Thread(testThreadSynchronized).start();

    }
}


class ThreadDamo extends Thread
{
    @Override
    public void run() {
        Thread t=Thread.currentThread();
        while(true){
            System.out.println("线程名称:"+t.getName());
        }

    }
}
class  ThreadJoin extends Thread
{
    @Override
    public void run() {
        Thread t=Thread.currentThread();
        for (int i=0;i<3;i++){
            System.out.println("线程名称-->"+t.getName());
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

/**
 * synchronized  同一时间只允许一个线程进行操作
 */
class TestThreadSynchronized extends Thread
{
    private int a=10;

    @Override
    public void run() {
        while(true)
        {
            synchronized (this){
                if(a<=0)break;
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程"+Thread.currentThread().getName()+"出售票"+a--);

            }
        }
    }
}