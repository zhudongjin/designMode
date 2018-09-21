package com.designmode.state;
/***
 * 准备状态 gold
 */
public class SoldOutState implements State {
    private CandyMachine candyMachine;

    public SoldOutState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("你不能投币，这台机器卖完了!");
    }

    @Override
    public void returnCoin() {
        System.out.println("你不能回来，你还没有插入硬币!");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动，却没有糖果!");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("********售罄状态!********");
    }
}
