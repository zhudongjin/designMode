package com.designmode.decorator;
/**
 * 牛肉味手抓饼
 * @author gold
 *添加牛肉属性
 */
public class Beffshredded extends Deractor {

    public Beffshredded(Cake cake) {
        super(cake);
    }

    public String descripestion() {
        return "牛肉"+cake.descripestion();
    }
    @Override
    public Double money() {
        return cake.money()+3.0;
    }
}
