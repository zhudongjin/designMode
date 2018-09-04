package com.designmode.decorator;
/**
 * 鸡蛋手抓饼类
 * @author gold
 *添加鸡蛋属性
 */
public class EggshrededCake extends Deractor {

    public EggshrededCake(Cake cake) {
        super(cake);
    }
    public String descripestion() {
        return "鸡蛋"+cake.descripestion();
    }
    @Override
    public Double money() {
        return 3.5+1.5;
    }
}
