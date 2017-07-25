package com.DuckType;

import com.FlyType.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();//这会调用MallardDuck继承来的performQuack()方法，进而委托给该对象的QuackBehavior对象处理（也就是说调用继承来的QuackBehavior引用对象的quack()）。
		mallard.performFly();
		
		//在运行时，想改变鸭子的行为，只需要调用鸭子的setter方法就可以了
		
		Duck model = new ModelDuck();
		model.performFly();//第一次调用performFly()会被委托给flyBehavior对象（也就是FlyNoWay实例），该对象是在模型鸭构造器中设置的
		model.setFlyBehavior(new FlyRocketPowered());//这会调用继承来的setter方法，把火箭动力飞行的行为设定到模型鸭中。哇！模型鸭突然具有了火箭动力飞行能力！
		model.performFly();//如果成功了，就意味着模型鸭可以动态地改变它的飞行行为。如果把行为的实现绑死在鸭子类中，可就无法做到这样了。
		
	}
}
