package com.company;

import java.lang.*;
import java.lang.Override;
import java.util.Scanner;

public class DeadThread {
    public static void main(String args[]){
        Person person=new Person();
        new Thread(new Producer(person)).start();
        new Thread(new Consumer(person)).start();
    }
}

class Producer implements Runnable{
    Person person=null;

    public Producer(Person person){
        this.person=person;
    }

    public Producer(){

    }

    @Override
    public void run() {
       for(int i=0;i<10;i++){
           if(i%2==0){
               person.set("张三","男");
           }
           else{
               person.set("李四","女");
           }
       }
    }
}

class Consumer implements Runnable{
    Person person=null;

    public Consumer(Person person){
        this.person=person;
    }
    public Consumer(){

    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            person.get();
        }
    }
}

class  Person{
    private String name;
    private String sex;
    private boolean bFull=false;


    public synchronized  void set(String name,String sex){
        if (bFull){
            try{
                wait();//后来的线程要等待
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name=name;
        this.sex=sex;
        bFull=true;
        notify();//唤醒最先到达的线程
    }

    public synchronized void get(){
        if (!bFull){
            try{
                wait();//后来的线程要等待
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.name+"---->"+this.sex);
        bFull=false;
        notify();//唤醒最先到达的线程
    }
}
