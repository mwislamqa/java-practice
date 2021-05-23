package com.bd.Baic_java;

class Parent{
	void m1() {
		System.out.println("method one");
	}
	void m2() {
		System.out.println("method two");
	}
}
class Child1 extends Parent{
	// super call imidate parent not grand parent
	void m1() {
		super.m1();
		System.out.println("method one child");
	}
	void m2() {
		
		super.m2();
		System.out.println("method two child");
	}
	
}
class Child2 extends Child1{
	void m1() {super.m1();
		System.out.println("method one child2");
	}
	void m2() {
		System.out.println("method two child2");
	}
	
}




