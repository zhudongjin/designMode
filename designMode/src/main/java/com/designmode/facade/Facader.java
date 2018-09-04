package com.designmode.facade;

public class Facader {
    private SubMethod1 sm1=new SubMethod1();
    private SubMethod2 sm2=new SubMethod2();
    private SubMethod3 sm3=new SubMethod3();

    public void method1(){
        sm1.method();
        sm2.method();
        sm3.method();
    }
    public void method2(){
        sm1.method();
        sm2.method();
    }
}
