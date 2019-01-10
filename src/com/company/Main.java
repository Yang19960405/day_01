package com.company;

import java.io.*;
import java.util.Random;

public class Main {

    //定义常量
    static  final Integer Year=100;

    /**
     *
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
        String str;
        //创建出入流对象Stdin来接收键盘的System.in的输入

        InputStreamReader stdin=new InputStreamReader(System.in);

        //以缓冲流模式接收stdin
        BufferedReader bufin=new BufferedReader(stdin);

        try
        {
            System.out.println("请输入名字");
            str=bufin.readLine();
            System.out.println("day_01:"+str);
        }
        catch(Exception e)
        {
            System.err.println("发生I/O错误");
            e.printStackTrace();
        }

        System.out.println("年"+Year);

        Random rand=new Random();
        int[] count;

        //给数组分配【0-10）的随机空间
        count=new int[rand.nextInt(10)];

        for(int i=0;i<count.length;i++)
        {
            count[i]=rand.nextInt();
            System.out.println("sount["+i+"]="+count[i]);
        }

    }
}
