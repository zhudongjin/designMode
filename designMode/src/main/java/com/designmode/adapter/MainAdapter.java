package com.designmode.adapter;

public class MainAdapter {

    public static void main(String[] args) {
        Computer computer = new ComputerImpl();//实例化Computer(父类引用指向子类对象)
        Adapter a = new Adapter(computer);//实例化适配器，可以理解为将另外一端连接到电脑的过程
        method(a);
    }
    //静态方法（已经提供了电）
    public static void method(Power p){
        p.electric();
    }
}
