package com.Decorator;
//�������
public class Espresso extends Beverage{//Ũ�����ȣ�����Espresso��չ��Beverage����ΪEspresso��һ������
	public Espresso(){
		description = "Espresso";//Ϊ��Ҫ�������ϵ�����������д��һ������������ס��descriptionʵ�������̳���Beverage
	}
	
	public double cost(){
		return 1.99;//�����Ҫ����Espresso�ļ�Ǯ�����ڲ���Ҫ�ܵ��ϵļ�Ǯ��ֱ�Ӱ�Espresso�ļ�Ǯ���ؼ���
	}
}
