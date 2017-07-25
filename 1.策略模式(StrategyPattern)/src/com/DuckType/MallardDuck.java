package com.DuckType;

import com.FlyType.FlyWithWings;
import com.QuackType.Quack;

//绿头鸭继承自Duck抽象类

public class MallardDuck extends Duck{
	//因为MallardDuck继承Duck类，所以具有flyBehavior和quackBehavior实例变量
	
	public MallardDuck(){
		quackBehavior = new Quack();//绿头鸭使用Quack类处理呱呱叫，所以当performQuack()被调用时，叫的职责被委托给了Quack对象，而我们得到了真正的呱呱叫。
		flyBehavior = new FlyWithWings();//使用FlyWithWings作为其FlyBehavior类型
	}
	
	public void display(){
		System.out.println("I'm a real Mallard duck");
	}
}
