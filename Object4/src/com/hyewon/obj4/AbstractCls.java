package com.hyewon.obj4;

public abstract class AbstractCls { // �޼����� �ϳ��� �߻�޼��尡 �ִ� Ŭ������ ������ �߻�Ŭ���� or �߻�޼��尡 �ϳ��� ������ �߻�Ŭ������ �ɼ�������
	public int sum(int a,int b) {
		return a+b;
	}
	
	public abstract int multi(int a,int b);
	// ��� �������̵��� ����ؼ� �����ؼ� ��ߵ� ������!!!!
	//�߻�Ŭ�������� �߰�ȣ �����ش�
	public abstract int minus(int a,int b);
}
