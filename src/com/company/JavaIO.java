package com.company;

import java.io.*;

public class JavaIO {
    public static void main(String args[]){
        File F1=new File("/");
        File F2=new File("/","abc.txt");
        File F3=new File(F1,"ACD.txt");

        if(F2.exists()){
            F2.delete();
        }
        else {
            try{
                F2.createNewFile();
            }
            catch(Exception e){
                System.out .println(e.getMessage());
            }
        }
        //getName()获得文件名
        System.out.println("文件名"+F2.getName());
        //getPath()获取文件路径[;
        System.out.println("文件路径"+F2.getPath());
        //getAbsolutePath()获得绝对路径
        System.out.println("绝对路径"+F2.getAbsolutePath());
        //getParent()获得父类菜单名
        System.out.println("父类菜单名"+F2.getParent());

    }
}
