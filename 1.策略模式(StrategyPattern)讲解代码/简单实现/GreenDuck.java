public class GreenDuck extends Duck{//GreenDuckֱ�Ӽ̳�Duck
	
	public GreenDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	/*����һ��չʾ�Լ���ʲôѼ�ӵķ���*/
	public void display(){
		System.out.println("I'm GreenDuck!");
	}
}