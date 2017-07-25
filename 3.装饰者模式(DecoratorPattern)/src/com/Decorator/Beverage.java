package com.Decorator;
//抽象组件
public abstract class Beverage {//饮料，Beverage是一个抽象类，有两个方法，getDescription()及cost()
	String description = "Unknown Beverage";
	
	public String getDescription(){//setDescription()已经在此实现
		return description;
	}
	
	public abstract double cost();//cost()必须在子类中实现
}
