package com.hyewon.obj4;

public class AbstTest {
	public static void main(String[] args) {

		// AbstCls abst = new AbstCls(); 추상메서드는 객체화 안됨!!
		// 추상클래스 인터페이스는 상속해서 사용해야됨

		/*
		 Calc c = new Calc(); Calc2 c2 = new Calc2();
		 System.out.println(c.sum(10, 20)); System.out.println(c2.sum(10, 20));
		 System.out.println(c.multi(10, 20)); System.out.println(c2.multi(10, 20));
		 AbstractCls ac= c; AbstractCls ac2= c2;
		 */

		AbstractCls cls = getObj(1); // 추상클래스는 호출은 가능하다 객체화가 불가! 자식클래스로 객체화가능함
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
