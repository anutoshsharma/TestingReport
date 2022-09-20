package com.testingReport;

import java.lang.*;

public class test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        test ts=new test();
        ts.teststring();

        //code(10,56,200);



    }
    public static void code (int x, int y, int z)
    {
        int total=x+(5*y);

        if(total>=z) {
            int n=z-(5*y);
            System.out.println("Acheivable,No of bottles used = "+n);
        }
        else
            System.out.println("Not Acheivable");
    }

    public static void teststring(){

        String a="hello";
        System.out.println(a);
        System.out.println(a.indexOf("e",2))  ;

    }
}