package com.DuckType;

import com.FlyType.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();//������MallardDuck�̳�����performQuack()����������ί�и��ö����QuackBehavior������Ҳ����˵���ü̳�����QuackBehavior���ö����quack()����
		mallard.performFly();
		
		//������ʱ����ı�Ѽ�ӵ���Ϊ��ֻ��Ҫ����Ѽ�ӵ�setter�����Ϳ�����
		
		Duck model = new ModelDuck();
		model.performFly();//��һ�ε���performFly()�ᱻί�и�flyBehavior����Ҳ����FlyNoWayʵ�������ö�������ģ��Ѽ�����������õ�
		model.setFlyBehavior(new FlyRocketPowered());//�����ü̳�����setter�������ѻ���������е���Ϊ�趨��ģ��Ѽ�С��ۣ�ģ��ѼͻȻ�����˻����������������
		model.performFly();//����ɹ��ˣ�����ζ��ģ��Ѽ���Զ�̬�ظı����ķ�����Ϊ���������Ϊ��ʵ�ְ�����Ѽ�����У��ɾ��޷����������ˡ�
		
	}
}
