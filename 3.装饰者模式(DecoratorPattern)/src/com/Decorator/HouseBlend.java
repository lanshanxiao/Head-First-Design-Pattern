package com.Decorator;
//�������
public class HouseBlend extends Beverage{
	public HouseBlend(){
		description = "House Blend Coffee";
	}
	
	public double cost(){
		return .89;//������һ�����ϣ�������Espressoһ����ֻ�ǰ�Espresso���Ƹ�Ϊ��House Blend Coffee������������ȷ�ļ�Ǯ
	}
}
