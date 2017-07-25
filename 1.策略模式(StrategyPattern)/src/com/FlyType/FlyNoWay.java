package com.FlyType;

public class FlyNoWay implements FlyBehavior{
	public void fly(){//这是飞行行为的实现，给不会飞的鸭子用（包括橡皮鸭和诱饵鸭）。
		System.out.println("I can't fly");
	}
}
