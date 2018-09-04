package com.designmode.decorator;
/**
 * 原味手抓饼类
 * @author gold
 *负责接收附加属性的类
 */
public class Shreddedcake implements Cake {
    @Override
    public String descripestion() {
        //描述属性
        return "原味手抓饼";
    }

    @Override
    public Double money() {
        //描述价格
        return 3.5;
    }
}
