package com.DuckType;

import com.FlyType.FlyBehavior;
import com.QuackType.QuackBehavior;

/*设计原则
 * 1.找出应用中需要变化之处，把它们独立出来，
 * 不要和那些不需要变化的代码混在一起。
 * 
 * 2.针对接口编程，而不是针对实现编程。
 * 针对接口编程真正的意思是“针对超类型编程”
 * 针对接口编程，关键就在多态，利用多态，程序
 * 可以针对超类型编程，执行时会根据实际状况执
 * 行到真正的行为，不会被绑死在超类型的行为上。
 * 针对超类型编程这句话，可以更明确的说成“变量
 * 的声明类型应该是超类型，通常是一个抽象类或者
 * 是一个接口
 * 下面是举例：
 * 针对实现编程：
 * Dog d = new Dog();
 * d.bark();
 * 针对接口/超类型编程：
 * Animal animal = new Dog();
 * animal.makeSound();
 * 
 * 3.多用组合，少用继承
 * 
 * 策略模式：定义了算法簇，分别封装起来，让它们
 * 之间可以相互替换，此模式让算法的变化独立于使
 * 用算法的客户
 */

public abstract class Duck {
	QuackBehavior quackBehavior;//每只鸭子都会引用实现QuackBehavior接口的对象
	FlyBehavior flyBehavior;//为行为接口类型声明两个引用变量，所有鸭子子类（在同一个package中）都继承它们
	
	public Duck(){
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;//我们随时可以调用setFlyBehavior()方法来改变鸭子飞行的行为
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;//我们随时可以调用setQuack           Behavior()方法来改变鸭子叫的行为
	}
	
	public abstract void display();
	
	public void performQuack(){//鸭子对象不亲自处理呱呱叫行为，而是委托给quackBehavior引用的对象
		quackBehavior.quack();//委托给行为类
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
	
	public void performFly(){
		flyBehavior.fly();//委托给行为类
	}
}
