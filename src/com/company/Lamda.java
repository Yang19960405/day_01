package com.company;
import java.lang.*;
import java.util.*;

public class Lamda {
    public static void main(String[] args){
        String[] Persons={"张三","李斯","王五","赵六"};
        List<String> stringList= Arrays.asList(Persons);
        stringList.forEach(stringList1->System.out.println("0"+stringList1));
    }
}
