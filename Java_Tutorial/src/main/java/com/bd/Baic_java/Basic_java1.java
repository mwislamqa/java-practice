package com.bd.Baic_java;

import java.util.Arrays;

public class Basic_java1 {
	
	
	public static void  m(Integer f, Integer r) {
		Integer t=f+r;
		System.out.println("method add funciton" +t);
	
	}

	public static void main(String[] args) {
		m(10,20);
		//explicit convertion
		double a=30.0;//convert double to int
		int i=(int)a;
		System.out.println("double convert to int"+i);
		float x=20.5f;
		double k=(double)x;
		System.out.println("float convert to double"+k);
		//convert string to int
		String s="35";
		int num=Integer.parseInt(s);
		System.out.println("String convert to int"+num);
		//covert int to string
		int q=12;
		String st=Integer.toString(q);
		System.out.println("int convert to string"+st);
		//array declear 
		int []a1 = new int [] {1,2,3,4,5};
		int p=Arrays.stream(a1).sum();
		System.out.println("sum of all array"+p);
				
		}
	
	static {
		double a=30.0;//convert double to int
		int i=(int)a;
		System.out.println("double convert to int"+i);
		float x=20.5f;
		double k=(double)x;
		System.out.println("float convert to double"+k);
		//convert string to int
		String s="66";
		int num=Integer.parseInt(s);
		System.out.println("String convert to int"+num);
		System.out.println("-------------------------------");
		
	}

	}


