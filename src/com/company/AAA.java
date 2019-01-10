package com.company;

public class AAA {
    public  static void main(String[] args){
         try{
             throw new MyException("自定义异常");
         }
         catch(MyException e){
             System.out.println(e.getMessage());
        }
        }
}

class MyException extends Exception{
    public MyException(String msg){
        super(msg);//调用Exception类的构造函数，来存储异常信息
    }
}
