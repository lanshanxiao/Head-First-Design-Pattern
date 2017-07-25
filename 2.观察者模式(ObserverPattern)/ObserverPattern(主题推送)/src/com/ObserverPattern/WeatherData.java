package com.ObserverPattern;

import java.util.ArrayList;

import com.DisplayType.Observer;

public class WeatherData implements Subject{
	//实例变量声明
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}
	
	public void notifyObservers(){
		for(Observer observer : observers){
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){//一旦气象测量更新，此方法会被调用
		//以下代码只是针对实现编程，不是针对接口编程
		/*float temp = getTemperature();//获取温度
		float humidity = getHumidity();//获取湿度
		float pressure = getPressure();//获取气压
		
		currentConditionsDisplay.update(temp, humidity, pressure);//气象统计板qaz2
		statisticsDisplay.update(temp, humidity, pressure);//目前状况显示板
		forecastDisplay.update(temp, humidity, pressure);//天气预报板
		*/
		
		//以下代码针对接口编程
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature(){
		return temperature;
	}
	
	public float getHumidity(){
		return humidity;
	}
	
	public float getPressure(){
		return pressure;
	}

}

