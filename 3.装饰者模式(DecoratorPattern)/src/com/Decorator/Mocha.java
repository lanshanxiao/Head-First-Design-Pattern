package com.Decorator;

public class Mocha extends CondimentDecorator{//摩卡是一个装饰者，所以让它扩展自CondimentDecorator，CondimentDecorator扩展自Beverage
	Beverage beverage;//要让Mocha能够引用一个Beverage，做法如下：（1）用一个实例变量记录饮料，也就是被装饰者。
	
	public Mocha(Beverage beverage){//（2）想办法让被装饰者（饮料）被记录到实例变量中。这里的做法是：把饮料当作构造器的参数，再由构造器将此饮料记录在实例变量中。
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ", Mocha";//我们希望叙述不只是描述饮料（例如“DarkRoast”），而是完整地连调料都描述出来（例如“DarkRoast， Mocha”）。所以首先利用委托的做法，得到一个叙述，然后在其后加上附加的叙述（例如“Mocha”）。
	}
	
	public double cost(){
		return .20 + beverage.cost();//要计算带Mocha饮料的价钱。首先把调用委托给被装饰者对象，以计算价钱，然后再加上Mocha的价钱，得到最后结果。
	}
}
