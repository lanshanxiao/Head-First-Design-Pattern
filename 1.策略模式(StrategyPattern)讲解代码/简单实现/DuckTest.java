public class DuckTest{//������
	public static void main(String args[]){
		GreenDuck greenDuck = new GreenDuck();//ʵ����һֻGreenDuck
		greenDuck.performFly();//һ��ʼGreenDuck���
		greenDuck.performQuack();//һ��ʼGreenDuck���
		
		/*��̬�ı�greenDuck����Ϊ*/
		greenDuck.setFlyBehavior(new FlyNoWay());
		greenDuck.setQuackBehavior(new MuteQuack());
		
		greenDuck.performFly();//���ڲ������
		greenDuck.performQuack();//���ڲ������
	}
}