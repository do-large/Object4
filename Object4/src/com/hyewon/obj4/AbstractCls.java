package com.hyewon.obj4;

public abstract class AbstractCls { // 메서드중 하나라도 추상메서드가 있는 클래스는 무조건 추상클래스 or 추상메서드가 하나도 없더라도 추상클래스가 될수도있음
	public int sum(int a,int b) {
		return a+b;
	}
	
	public abstract int multi(int a,int b);
	// 얘는 오버라이딩을 사용해서 구현해서 써야됨 무조건!!!!
	//추상클래스에는 중괄호 안해준다
	public abstract int minus(int a,int b);
}
