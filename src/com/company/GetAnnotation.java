package com.company;

import java.lang.Override;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Method.*;
import java.lang.*;
import java.util.Date;
import com.company.*;

class Info{
    @Override
    @SuppressWarnings(value = "aaa")
    public String toString(){
        return "Hello,World";
    }
}


public class GetAnnotation {
    @MyAnnotation(color = Color.RED)
    public static void main(String[]args) throws Exception
    {
        Class<?> cls1=Class.forName("Info");
        Method toStringMethod=cls1.getMethod("toString");
        Annotation ans[]=toStringMethod.getAnnotations();
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}



@interface MyAnnotation{
    public String Key() default "val1";
    public String Value() default "value";

    public Color color();
}

enum Color{
    RED,BLUE,GREEN;
}


