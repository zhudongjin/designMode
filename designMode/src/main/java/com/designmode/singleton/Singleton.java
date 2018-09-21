package com.designmode.singleton;

public class Singleton {
    private static Singleton singleton=new Singleton();

    public Singleton(){}

    public static Singleton getSingleton(){
        return singleton;
    }
}
