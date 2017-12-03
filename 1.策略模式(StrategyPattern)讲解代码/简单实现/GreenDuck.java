public class GreenDuck extends Duck{//GreenDuck直接继承Duck
	
	public GreenDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	/*增加一个展示自己是什么鸭子的方法*/
	public void display(){
		System.out.println("I'm GreenDuck!");
	}
}