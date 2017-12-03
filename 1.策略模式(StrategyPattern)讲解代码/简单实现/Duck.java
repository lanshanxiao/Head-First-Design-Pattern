public abstract class Duck{//抽象鸭子类

	/*增加两个接口对象*/
	FlyBehavior flyBehavior;//飞行类对象
	QuackBehavior quackBehavior;//呱呱叫类对象
	
	public Duck(){
	}
	
	//去除下面两个方法
	/*public void fly(){//行为：飞行
		System.out.println("I'm flying!");
	}
	public void quack(){//行为：呱呱叫
		System.out.println("Gua Gua!");
	}*/
	
	/*增加下面两个方法，这就是将Duck类的行为委托给两个接口对象实现*/
	public void performFly(){//将fly()委托给flyBehavior对象实现
		flyBehavior.fly();
	}
	public void performQuack(){//将quack()委托给quackBehavior对象实现
		quackBehavior.quack();
	}
	
	/*添加两个新方法，可以动态的改变具体变化类*/
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
	
	public void swim(){//行为：游泳
		System.out.println("I'm swimming!");
	}
}