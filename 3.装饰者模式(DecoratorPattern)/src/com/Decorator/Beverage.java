package com.Decorator;
//�������
public abstract class Beverage {//���ϣ�Beverage��һ�������࣬������������getDescription()��cost()
	String description = "Unknown Beverage";
	
	public String getDescription(){//setDescription()�Ѿ��ڴ�ʵ��
		return description;
	}
	
	public abstract double cost();//cost()������������ʵ��
}
