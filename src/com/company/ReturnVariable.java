package com.company;

import java.util.ArrayList;
import java.lang.*;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

public class ReturnVariable {
    public static void main(String[] args)
    {
        TestReturn tr=new TestReturn();
        ArrayList<Integer> intArray=tr.getIntArray();
        System.out.println("ArrayList长度："+intArray.size());

        intArray.add(4);
        System.out.println("添加新数据后ArrayList长度："+intArray.size());
    }

}

class TestReturn{
    private ArrayList<Integer> intArray=new ArrayList<Integer>();

    TestReturn(){
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
    }

    ArrayList<Integer> getIntArray()
    {
        return intArray;
    }
}