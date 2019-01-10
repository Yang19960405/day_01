package com.company;

import java.time.*;
import java.time.format.*;//格式化时间对象
import java.util.regex.*;

public class LocalDateTimes {
    public static void main(String[] args){
        LocalDateTime ldt=LocalDateTime.now();
        LocalDate ld=LocalDate.now();
        LocalTime lt=LocalTime.now();
        System.out.println(ldt);
        System.out.println(ld);
        System.out.println(lt);

        Year year1=Year.of(2012);
        YearMonth monthDay=year1.atMonth(6);
        LocalDate ld2=monthDay.atDay(28);
        System.out.println(ld2.isLeapYear());

        LocalDate localDate=LocalDate.now();
        //指定格式化规则
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-->MM-->uuuu");
        String str=localDate.format(f);
        System.out.println(str);


    }
}
