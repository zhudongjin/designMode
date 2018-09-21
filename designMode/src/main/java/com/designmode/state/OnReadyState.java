package com.designmode.state;
/***
 * 准备状态 gold
 */
public class OnReadyState implements State {
    private CandyMachine candyMachine;
    public OnReadyState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("你已经插入一枚硬币，接下来，请转动曲柄!");
        candyMachine.setState(candyMachine.mHasCoin);
    }

    @Override
    public void returnCoin() {
        System.out.println("你还没装硬币呢!");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转过身来，但你还没插入硬币!");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("********状态就绪！********");
    }
}
