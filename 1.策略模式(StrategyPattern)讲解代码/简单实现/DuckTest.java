public class DuckTest{//测试类
	public static void main(String args[]){
		GreenDuck greenDuck = new GreenDuck();//实例化一只GreenDuck
		greenDuck.performFly();//一开始GreenDuck会飞
		greenDuck.performQuack();//一开始GreenDuck会叫
		
		/*动态改变greenDuck的行为*/
		greenDuck.setFlyBehavior(new FlyNoWay());
		greenDuck.setQuackBehavior(new MuteQuack());
		
		greenDuck.performFly();//现在不会飞了
		greenDuck.performQuack();//现在不会叫了
	}
}