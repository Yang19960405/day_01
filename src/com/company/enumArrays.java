package com.company;
import java.lang.*;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

enum MyColor{红,黄,原谅色}

enum NewColor{
    RED("红色",10086),GREEN("绿色",110),BLUE("蓝色",120);

    private String name;
    private Integer index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    private NewColor(String name, Integer index)//私有构造方法
    {
        this.name=name;
        this.index=index;

    }

    /**
     * 通过index获取name
     * @param index
     * @return
     */
    public static String getName(int index)
    {
        for(NewColor newColor:NewColor.values())
        {
            if (newColor.index==index)
                return newColor.name;
        }
        return null;
    }

    public static void setName(Integer index,String name)
    {
        for(NewColor newColor:NewColor.values())
        {
            if(newColor.getIndex()==index) {
                newColor.name = name;
                return;
            }
        }
    }

    public static void setIndex(Integer index,String name)
    {
        for(NewColor newColor:NewColor.values()){
            if(newColor.getName()==name){
                newColor.index=index;
                return;
            }
        }
    }


}

enum InterfaceColor implements ColorInterface{
    //每一个枚举对象都要具体实现从接口中继承哎的方法
    红色{
        public String getColor(){
            return "RED";
        }
    },
    绿色{
        public String getColor(){
            return "GREEN";
        }
    },
    蓝色{
        public String getColor(){
            return "BLUE";
        }
    };
}

public class enumArrays {
    public static void main(String[] args)
    {
        MyColor[] myColor=MyColor.values();


        EnumMap<MyColor,String> eColor=new EnumMap<MyColor, String>(MyColor.class);//EnumMap使用方法
        eColor.put(MyColor.红,"hong");//添加EnumMap元素
        eColor.put(MyColor.黄,"huang");
        eColor.put(MyColor.原谅色,"lu");

        for(Map.Entry<MyColor,String> mColor:eColor.entrySet())
        {
            System.out.println(mColor.getKey()+"-->"+mColor.getValue());
        }

        for (MyColor color:myColor
                ) {
            System.out.println(color+"-->"+color.ordinal());

        }
        for(EnumMap.Entry<MyColor,String> mColor:eColor.entrySet())
        {
            System.out.println(mColor.getKey()+"-->"+mColor.getValue());
        }

        EnumSet<MyColor> setColor=EnumSet.allOf(MyColor.class);//将枚举全部内容设置到集合中
        Iterator<MyColor> iter=setColor.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
       //System.out.println(MyColor.valueOf((MyColor.class),"原谅色"));

        System.out.println(NewColor.RED.getIndex()+"-->"+NewColor.RED.getName());
        System.out.println(NewColor.GREEN.getIndex()+"-->"+NewColor.GREEN.getName());
        System.out.println(NewColor.BLUE.getIndex()+"-->"+NewColor.BLUE.getName());

        System.out.println("------------调皮的分割线-------------");
        NewColor.setName(120,"蓝蓝色");//重新设定字段值
        NewColor.setIndex(119,"红色");
        System.out.println(NewColor.RED.getIndex()+"-->"+NewColor.RED.getName());
        System.out.println(NewColor.BLUE.getIndex()+"-->"+NewColor.BLUE.getName());

        System.out.println("------------调皮的分割线-------------");

        for(InterfaceColor interfaceColor:InterfaceColor.values())
        {
            System.out.println(interfaceColor.name()+"-->"+interfaceColor.ordinal()+"-->"+interfaceColor.getColor());
        }
    }


}

//枚举接口
interface ColorInterface{

    public String getColor();
}
