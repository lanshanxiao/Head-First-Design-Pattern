package com.Decorator;
//抽象装饰者
public abstract class CondimentDecorator extends Beverage{//调料装饰，必须让ComdimentDecorator能够取代Beverage，所以讲CondimentDecorator扩展自Beverage类
	public abstract String getDescription();//所有的调料装饰者都必须重新实现getDecorator()方法。
}