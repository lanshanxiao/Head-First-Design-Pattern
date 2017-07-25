package com.DuckType;

import com.FlyType.FlyWithWings;
import com.QuackType.Quack;

//��ͷѼ�̳���Duck������

public class MallardDuck extends Duck{
	//��ΪMallardDuck�̳�Duck�࣬���Ծ���flyBehavior��quackBehaviorʵ������
	
	public MallardDuck(){
		quackBehavior = new Quack();//��ͷѼʹ��Quack�ദ�����ɽУ����Ե�performQuack()������ʱ���е�ְ��ί�и���Quack���󣬶����ǵõ������������ɽС�
		flyBehavior = new FlyWithWings();//ʹ��FlyWithWings��Ϊ��FlyBehavior����
	}
	
	public void display(){
		System.out.println("I'm a real Mallard duck");
	}
}
