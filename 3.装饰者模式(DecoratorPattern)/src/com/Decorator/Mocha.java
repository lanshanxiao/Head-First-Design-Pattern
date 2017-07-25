package com.Decorator;

public class Mocha extends CondimentDecorator{//Ħ����һ��װ���ߣ�����������չ��CondimentDecorator��CondimentDecorator��չ��Beverage
	Beverage beverage;//Ҫ��Mocha�ܹ�����һ��Beverage���������£���1����һ��ʵ��������¼���ϣ�Ҳ���Ǳ�װ���ߡ�
	
	public Mocha(Beverage beverage){//��2����취�ñ�װ���ߣ����ϣ�����¼��ʵ�������С�����������ǣ������ϵ����������Ĳ��������ɹ������������ϼ�¼��ʵ�������С�
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + ", Mocha";//����ϣ��������ֻ���������ϣ����硰DarkRoast���������������������϶��������������硰DarkRoast�� Mocha������������������ί�е��������õ�һ��������Ȼ���������ϸ��ӵ����������硰Mocha������
	}
	
	public double cost(){
		return .20 + beverage.cost();//Ҫ�����Mocha���ϵļ�Ǯ�����Ȱѵ���ί�и���װ���߶����Լ����Ǯ��Ȼ���ټ���Mocha�ļ�Ǯ���õ��������
	}
}
