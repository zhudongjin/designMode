package com.designmode.proxy.state;

public class RealSubject implements Subject {

    private String name = "sdf";
    @Override
    public void visit() {
        System.out.println(name);
    }
}
