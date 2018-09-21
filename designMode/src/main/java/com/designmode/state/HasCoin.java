package com.designmode.state;

import java.util.Random;

/***
 * 准备状态 gold
 */
public class HasCoin implements State {

    private CandyMachine candyMachine;

    public HasCoin(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("你不能再扔硬币了!");
    }

    @Override
    public void returnCoin() {
        System.out.println("退币");
        candyMachine.setState(candyMachine.mOnReadyState);
    }

    @Override
    public void turnCrank() {
        System.out.println("曲柄转动.....");
        Random rm = new Random();
        int winer = rm.nextInt(10);
        if(winer == 0){
            candyMachine.setState(candyMachine.mWinnerState);
        }else{
            candyMachine.setState(candyMachine.mSoldState);
        }
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printstate() {
        System.out.println("********已有硬币！********");
    }
}
