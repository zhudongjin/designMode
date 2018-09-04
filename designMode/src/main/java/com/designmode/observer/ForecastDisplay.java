package com.designmode.observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 28.82f; // 当前气压
    private float lastPressure;             // 上一次的气压
    private Subject weatherData;            // 主题

    // 同显示1
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    // 显示
    public void display() {
        // TODO Auto-generated method stub

        if (currentPressure > lastPressure) {
            System.out.println("3,天气预报：温度正在持续上升！");
        } else {
            System.out.println("3,天气预报：注意气温下降了，可能有雨！");
        }
    }

    // 更新
    public void update(float temp, float humidity, float pressure) {
        // TODO Auto-generated method stub
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }
}
