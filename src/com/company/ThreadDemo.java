package com.company;
import java.lang.*;
import java.lang.Override;
import java.util.Scanner;


public class ThreadDemo {
    public static void main(String args[]){
        GetNameThreadDemo t=new GetNameThreadDemo();
        System.out.println("处于创建状态");
        //new Thread(t).start();

        t.start();

        for (int i=0;i<3;i++){
            t.printMsg();
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(int i=0;i<5;++i){
            System.out.println("main线程正在运行");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


class TestThread implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;++i){
            System.out.println("Thread正在执行");
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
 * 演示线程的生命周期
 */
class ThreadStatus implements Runnable{
    @Override
    public void run() {
        System.out.println("处于运行状态");

        Scanner scanner=new Scanner(System.in);
        System.out.println("等待i/o,处于阻塞状态");

        System.out.println("请输入字符串");

        scanner.next();//next()方法扫描scanner输入的字符串

        scanner.close();//扫描结束，系统不再等待I/O操作，线程从新进入就绪状态

        System.out.println("结束阻塞状态，重新定义就绪状态，然后运行");

        try{
            Thread.sleep(1000);  //线程暂停1秒
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程进入死亡状态");

    }
}

class GetNameThreadDemo extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            printMsg();
            try{
                Thread.sleep(1000);  //线程暂停1秒
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获得运行此代码的名称
     */
    public void printMsg(){
        Thread t=Thread.currentThread();
        String name=t.getName();
        System.out.println("name="+name);
    }
}

