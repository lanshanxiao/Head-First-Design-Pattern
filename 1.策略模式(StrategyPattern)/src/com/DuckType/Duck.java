package com.DuckType;

import com.FlyType.FlyBehavior;
import com.QuackType.QuackBehavior;

/*���ԭ��
 * 1.�ҳ�Ӧ������Ҫ�仯֮���������Ƕ���������
 * ��Ҫ����Щ����Ҫ�仯�Ĵ������һ��
 * 
 * 2.��Խӿڱ�̣����������ʵ�ֱ�̡�
 * ��Խӿڱ����������˼�ǡ���Գ����ͱ�̡�
 * ��Խӿڱ�̣��ؼ����ڶ�̬�����ö�̬������
 * ������Գ����ͱ�̣�ִ��ʱ�����ʵ��״��ִ
 * �е���������Ϊ�����ᱻ�����ڳ����͵���Ϊ�ϡ�
 * ��Գ����ͱ����仰�����Ը���ȷ��˵�ɡ�����
 * ����������Ӧ���ǳ����ͣ�ͨ����һ�����������
 * ��һ���ӿ�
 * �����Ǿ�����
 * ���ʵ�ֱ�̣�
 * Dog d = new Dog();
 * d.bark();
 * ��Խӿ�/�����ͱ�̣�
 * Animal animal = new Dog();
 * animal.makeSound();
 * 
 * 3.������ϣ����ü̳�
 * 
 * ����ģʽ���������㷨�أ��ֱ��װ������������
 * ֮������໥�滻����ģʽ���㷨�ı仯������ʹ
 * ���㷨�Ŀͻ�
 */

public abstract class Duck {
	QuackBehavior quackBehavior;//ÿֻѼ�Ӷ�������ʵ��QuackBehavior�ӿڵĶ���
	FlyBehavior flyBehavior;//Ϊ��Ϊ�ӿ����������������ñ���������Ѽ�����ࣨ��ͬһ��package�У����̳�����
	
	public Duck(){
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;//������ʱ���Ե���setFlyBehavior()�������ı�Ѽ�ӷ��е���Ϊ
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;//������ʱ���Ե���setQuack           Behavior()�������ı�Ѽ�ӽе���Ϊ
	}
	
	public abstract void display();
	
	public void performQuack(){//Ѽ�Ӷ������Դ������ɽ���Ϊ������ί�и�quackBehavior���õĶ���
		quackBehavior.quack();//ί�и���Ϊ��
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
	
	public void performFly(){
		flyBehavior.fly();//ί�и���Ϊ��
	}
}
