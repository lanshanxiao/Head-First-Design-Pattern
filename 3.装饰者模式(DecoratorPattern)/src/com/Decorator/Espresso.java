package com.Decorator;
//具体组件
public class Espresso extends Beverage{//浓缩咖啡，首先Espresso扩展自Beverage，因为Espresso是一种饮料
	public Espresso(){
		description = "Espresso";//为了要设置饮料的描述，我们写了一个构造器。记住，description实例变量继承自Beverage
	}
	
	public double cost(){
		return 1.99;//最后，需要计算Espresso的价钱，现在不需要管调料的价钱，直接把Espresso的价钱返回即可
	}
}
