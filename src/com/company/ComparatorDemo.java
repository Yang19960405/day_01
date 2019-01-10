package com.company;

import javax.swing.text.html.HTMLDocument;
import java.lang.*;
import java.lang.Override;
import java.util.*;
import java.util.function.ToIntFunction;
import java.util.Map.Entry;

class MyComp implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
        String str1,str2;
        str1=(String)o1;
        str2=(String)o2;
        return  str1.compareTo(str2);
    }
}

class Employee implements Comparator<Object>{
    @Override
    public int compare(Object o1, Object o2) {
        int k;
        String str1,str2;
        str1=(String)o1;
        str2=(String)o2;
        k=str1.compareTo(str2);
        if(k==0)
            return str1.compareTo(str2);
        else
            return k;
    }
}

public class ComparatorDemo {
    public static void main(String[] args){
        TreeSet<String> treeSet=new TreeSet<String>(new MyComp());

        TreeMap<String,Double> treeMap=new TreeMap<String,Double>(new Employee());

        treeSet.add("G");
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("J");
        treeSet.add("E");

        Iterator<String> i=treeSet.iterator();

        while (i.hasNext()){
            System.out.println(""+i.next());
        }

        treeMap.put("Z,张三",new Double(12312.1));
        treeMap.put("Z,张4",new Double(1212312.1));
        treeMap.put("Z,张5",new Double(3123));
        treeMap.put("Z,张6",new Double(1231123122.1));
        treeMap.put("Z,张1",new Double(342123));


    }
}
