public abstract class Duck{//����Ѽ����

	/*���������ӿڶ���*/
	FlyBehavior flyBehavior;//���������
	QuackBehavior quackBehavior;//���ɽ������
	
	public Duck(){
	}
	
	//ȥ��������������
	/*public void fly(){//��Ϊ������
		System.out.println("I'm flying!");
	}
	public void quack(){//��Ϊ�����ɽ�
		System.out.println("Gua Gua!");
	}*/
	
	/*����������������������ǽ�Duck�����Ϊί�и������ӿڶ���ʵ��*/
	public void performFly(){//��fly()ί�и�flyBehavior����ʵ��
		flyBehavior.fly();
	}
	public void performQuack(){//��quack()ί�и�quackBehavior����ʵ��
		quackBehavior.quack();
	}
	
	/*��������·��������Զ�̬�ĸı����仯��*/
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
	
	
	public void swim(){//��Ϊ����Ӿ
		System.out.println("I'm swimming!");
	}
}