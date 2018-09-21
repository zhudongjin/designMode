package com.designmode.state;

/***
 * 状态模式 gold
 */
public interface State {
    public void insertCoin();
    public void returnCoin();
    public void turnCrank();
    public void dispense();
    public void printstate();
}
