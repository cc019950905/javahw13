package com.example.lib;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("請輸入性別 ex:man (woman)");
        String s=sc.next();
        System.out.println("請輸入年齡");
        int y =sc.nextInt();

        Pattern p1 =Pattern.compile("man");
        Matcher m1=p1.matcher(s);
        if(m1.find()){
            if(y>=18){
                System.out.println("可以結婚");
            }else{
                System.out.println("不能結婚");
            }
        }
        Pattern p2 =Pattern.compile("woman");
        Matcher m2=p1.matcher(s);
        if(m2.find()){
            if(y>=16){
                System.out.println("可以結婚");
            }else{
                System.out.println("不能結婚");
            }
        }
    }
}
