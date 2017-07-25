package com.ObserverPattern;

import java.util.ArrayList;

import com.DisplayType.Observer;

public class WeatherData implements Subject{
	//ʵ����������
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
	
	public void measurementsChanged(){//һ������������£��˷����ᱻ����
		//���´���ֻ�����ʵ�ֱ�̣�������Խӿڱ��
		/*float temp = getTemperature();//��ȡ�¶�
		float humidity = getHumidity();//��ȡʪ��
		float pressure = getPressure();//��ȡ��ѹ
		
		currentConditionsDisplay.update(temp, humidity, pressure);//����ͳ�ư�qaz2
		statisticsDisplay.update(temp, humidity, pressure);//Ŀǰ״����ʾ��
		forecastDisplay.update(temp, humidity, pressure);//����Ԥ����
		*/
		
		//���´�����Խӿڱ��
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

