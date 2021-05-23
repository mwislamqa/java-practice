package com.bd.Baic_java;

public class AbstractDemo2 extends AbstructionDemo {

	
	
	public void m2() {
		System.out.println("2 public method");
	}
	public static void main(String[] args) {
		// if we carete dinamic obj then we can not call current class method only abstruct class method 
		//we can call .
		//AbstructionDemo ast=	 new AbstractDemo2();
		
		AbstractDemo2 ast=	 new AbstractDemo2();
		ast.m();
		ast.m1();
		ast.m2();
	}
	@Override
	void m() {
		System.err.println("override method from abstructiondemo");
	}
	
	

}
