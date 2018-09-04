package com.designmode.observer;

import java.util.ArrayList;

/***
 * 具体的主题
 * @author  gold
 */
public class WeatherData implements Subject {
    // 用以维护所有注册的观察者
    private ArrayList<Observer> observers;

    private float temperature; //温度
    private float humidity;    //湿度
    private float pressure;    //气压

    // 构造时，new出列表对象
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    // 注册
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub
        observers.add(o);
    }

    // 移除
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    // 通知所有
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for (int i = 0; i < observers.size(); ++i){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    // 当数据改变时通知，掌握主动
    public void measurementsChanged(){
        notifyObservers();
    }

    // 设置数据
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
