package com.cybertek.Utilities;

public class Singleton {

    private static String str;

    private Singleton(){}

    public static String get(){
        if (str==null){
            System.out.println("adding value");
            str = "asdfasdfasdf";
        }
        return str;
    }
}