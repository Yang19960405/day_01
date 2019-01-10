import com.company.Test;
import java.util.*;

public class   Abstract {
    public static void main(String[] args)
    {


        Book.CD cd=new JavaCD();
        cd.get();;

        Person p=new Person(110,"aaa");
        Person p2=new Person(110,"aaa");
        System.out.println(p.equals(p2)?"同":"不同");

        new Abstract().Test(new Bird(){
            public int fly(){
                return 2000;
            }

            public String getName(){
                return "小鸟";
            }
        });

        String a="1234";
        Integer b=Integer.parseInt(a);
        Integer d=new Integer(10);//装箱
        int c=b.intValue();//拆箱

        //打印当前虚拟机的所有环境属性的变量和值
        Properties sp=System.getProperties();
        Enumeration e=sp.propertyNames();
        while(e.hasMoreElements()){
            String st=(String) e.nextElement();
            System.out.println(st+"="+sp.getProperty(st));
        }

        Runtime run=Runtime.getRuntime();
        String str="";
        for (int i=0;i<4000;i++)
        {
            str+=i;//垃圾产生
        }
        System.out.println("最大内存："+run.maxMemory());
        System.out.println("总内存："+run.totalMemory());
        System.out.println("可用内存："+run.freeMemory());

        run.gc();//清除垃圾
        System.out.println("-------------------");
        System.out.println("最大内存："+run.maxMemory());
        System.out.println("总内存："+run.totalMemory());
        System.out.println("可用内存："+run.freeMemory());

    }

    public void Test(Bird bird){
        System.out.println(bird.getName()+"飞了"+bird.fly()+"米");
    }
}


abstract class Book{
    //定义内部抽象类
    abstract static class CD {
        public abstract void get();
    }
}

class JavaCD extends Book.CD{
    public void get(){
        System.out.println("回首");

    }
}

class Person{
    private int a;
    private String b;

    public  String toString(){
        return a+b;

    }

    public Person (int a,String b){
        this.a=a;
        this.b=b;
    }

    //equals对象重写 精准对两个函数进行比较
    public boolean equals(Object o){
        boolean c=true;
        Person p1=this;
        if(o instanceof Person){
            Person p2=(Person)o;
            if(!(p1.b.equals(p2.b)&&p1.a==p2.a)){
                c=false;
            }

        }
        else
        {
            c=false;
        }
        return c;

    }
}

abstract class Bird{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public abstract int fly();
}
