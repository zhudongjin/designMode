package com.designmode.state;

public class SoldState implements State {

    private CandyMachine candyMachine;
    public SoldState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("请稍等!我们给你一颗糖果!");
    }

    @Override
    public void returnCoin() {
        System.out.println("你还没装硬币呢!");
    }

    @Override
    public void turnCrank() {
        System.out.println("我们给了你一颗糖，却换了一颗什么也没得到!");
    }

    @Override
    public void dispense() {
        candyMachine.releaseCandy();
        if(candyMachine.getCount() > 0){
            candyMachine.setState(candyMachine.mOnReadyState);
        }else{
            System.out.println("Oo,糖果");
            candyMachine.setState(candyMachine.mSoldOutState);
        }
    }

    @Override
    public void printstate() {
        System.out.println("********销售状态********");
    }
}
