package com.hyewon.obj4;

public class AbstTest {
	public static void main(String[] args) {

		// AbstCls abst = new AbstCls(); �߻�޼���� ��üȭ �ȵ�!!
		// �߻�Ŭ���� �������̽��� ����ؼ� ����ؾߵ�

		/*
		 Calc c = new Calc(); Calc2 c2 = new Calc2();
		 System.out.println(c.sum(10, 20)); System.out.println(c2.sum(10, 20));
		 System.out.println(c.multi(10, 20)); System.out.println(c2.multi(10, 20));
		 AbstractCls ac= c; AbstractCls ac2= c2;
		 */

		AbstractCls cls = getObj(1); // �߻�Ŭ������ ȣ���� �����ϴ� ��üȭ�� �Ұ�! �ڽ�Ŭ������ ��üȭ������
		printResult(cls, 10, 20);
	}

	public static AbstractCls getObj(int a) {
		if (a == 1) {
			return new Calc();
		} else {
			return new Calc3();
		}
	}

	public static void printResult(AbstractCls cls, int a, int b) {
		System.out.println(cls.multi(a, b));
	}
}
