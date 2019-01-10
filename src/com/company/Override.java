package com.company;

public class Override {
    public static void main(String[] args){
        aaaa a2=new aaaa("小小闪",110);
        aaaa a=new son("小小闪",123456,"角色");
        son s=new son("小小闪",123456,"角色");
        System.out.println(a.Print());
        System.out.println(a.Print2());
        System.out.println(a2.Print());
        System.out.println(s.Print2());

    }
}

class aaaa{
    private String name;
    private Integer pass;

    public aaaa(String name,Integer pass)
    {
        this.name=name;
        this.pass=pass;
    }

    public String Print(){
        return  "父类方法-->"+name+"-->"+pass;
    }
    public String Print2(){
        return  "父类方法-->"+name+"-->"+pass;
    }
}

class son extends aaaa
{
    private String role;

    public son(String name,Integer pass, String role){
        super(name,pass);
        this.role=role;

    }

    public String Print(){
       return  "子类方法-->"+role;
    }
    public String Print2(){
        return  super.Print2()+Print();
    }
}
