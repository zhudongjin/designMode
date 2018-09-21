package com.designmode.command;

/***
 * 每个接收者都必须处理一定的业务逻辑
 */
public class ConcreteReciver1 extends Receiver {

    @Override
    public void doSomething() {
        System.out.println("我是第一个具体接收者，我在打印日志");
    }
}
