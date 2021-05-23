package com.bd.Baic_java;

public class Interface_class implements Interface1,Interface2{

	public static void main(String[] args) {
		Interface_class ic = new Interface_class();
		
		
		ic.m1();
		ic.m2();
		ic.m3();
	}


	public void m1() {
		System.out.println(a);
		
	}

	public void m2() {

System.out.println("m2 metheod");
		
	}

	public void m3() {
		System.out.println("method m3");
		
	}


}
