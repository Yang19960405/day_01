package com.company;

public class Test extends Father
{
    private String name="test";
    public static void main(String[] args)
    {



        Test test = new Test();
        System.out.println(test.getName());
    }

    }


class Father{
    private String name="fathaaaaaer";
    public String getName() {
        return name;
    }
}
