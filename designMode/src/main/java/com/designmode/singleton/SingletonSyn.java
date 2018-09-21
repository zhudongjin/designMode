package com.designmode.singleton;

public class SingletonSyn {

    public static volatile SingletonSyn singletonSyn = null;

    private SingletonSyn(){}

    public static SingletonSyn getSingletonSyn(){

        if(singletonSyn == null ){
            synchronized (SingletonSyn.class){
                if(singletonSyn == null ){
                    singletonSyn = new SingletonSyn();
                }
            }
        }
        return singletonSyn;
    }
}
