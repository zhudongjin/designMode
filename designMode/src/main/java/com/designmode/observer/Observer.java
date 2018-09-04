package com.designmode.observer;
/***
 * 观察者接口
 * @author gold
 *
 */
public interface Observer {
    /***
     * 用以更新数据
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temp, float humidity, float pressure);
}
