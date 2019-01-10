package com.company;

public class Sub {
    public static void main(String[] args){
        String str="asdjjasdkjd_8 SSS_343ew yersa nky 532ehaj 130s";
        String str2="123412adwads23412";
        if(str.matches("\\w+\\s\\w+\\s+\\w+\\s+\\w+\\s\\w+\\s\\w+")){
            System.out.println("11");
        }
        if(str2.matches("\\d+\\D+")){
            System.out.println("11");
        }

        String str3="495241111@qaq.com";
        if(str3.matches("\\d{6,11}@\\D{2,3}.com")){
            System.out.println("验证成功");
        }
        else {
            System.out.println("验证失败");
        }

    }
}
