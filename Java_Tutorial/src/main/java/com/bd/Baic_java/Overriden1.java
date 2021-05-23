package com.bd.Baic_java;

public class Overriden1 {
// same method name and same signeser but body logic should be different
	//same method name but signatue different is called overloading.
		public static void main(String[] args) {
			
			
			Child1 ch=new Child1();
			ch.m1();
			ch.m2();
			System.out.println("-------------------------");
			Child2 ch2= new Child2();
			ch2.m1();
			ch2.m2();
			System.out.println("-------------------------");
			Parent ch3=new Child2();
			ch3.m1();
			ch3.m2();
		}
		

	}


