package com.hyewon.obj4;

public abstract class Calc2 extends AbstractCls { // 추상클래스를 추상클래스가 상속받는거 가능! but 객체화 불가
	@Override
	public int multi(int a, int b) {
		return (a * b) * 2;
	}

	
}
