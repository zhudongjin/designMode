package com.designmode.command;

/***
 * 每个命令类都必须有一个执行命令的方法
 * 命令模式也是有缺点的，请看Command的子类：如果有N个命令，问题就出来了，Command的子类就可不是几个，而是N个，这个类膨胀得非常大，这个就需要读者在项目中慎重考虑使用。
 */
public abstract class Command {
    public abstract void execute();
}
