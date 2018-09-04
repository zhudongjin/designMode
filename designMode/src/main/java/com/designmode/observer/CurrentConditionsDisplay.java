package com.designmode.observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;    //温度
    private float humidity;       //湿度
    private Subject weatherData;  //主题

    // 当前布告板 构造之时 订阅 了 主题
    public CurrentConditionsDisplay(Subject subject){
        this.weatherData=subject;
        this.weatherData.registerObserver(this);
    }
    // 显示
    @Override
    public void display() {
        System.out.println("1,当前布告板: 温度"+ temperature +"度,湿度"+humidity+"%");
    }
    // 更新
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;

        this.humidity=humidity;

        display();
    }
}
