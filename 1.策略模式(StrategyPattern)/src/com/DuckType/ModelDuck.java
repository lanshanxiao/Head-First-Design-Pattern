package com.DuckType;

import com.FlyType.FlyNoWay;
import com.QuackType.Quack;

public class ModelDuck extends Duck {
	public ModelDuck(){
		flyBehavior = new FlyNoWay();//һ��ʼģ��Ѽ�����
		quackBehavior = new Quack();
	}
	
	public void display(){
		System.out.println("I'm a model duck");
	}
}