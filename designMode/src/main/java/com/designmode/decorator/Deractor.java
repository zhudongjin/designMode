package com.designmode.decorator;
/**
 * 建立和饼的连接，得到原始饼的属性，添加属性的中介。
 * @author gold
 *
 */
public abstract class Deractor implements Cake {

    Cake cake;
    public Deractor(Cake cake){
        this.cake=cake;
    }
    public String descripestion(){
        return cake.descripestion();
    }
    public Double money(){
        return cake.money();
    }

}
