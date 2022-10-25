package com.bridgelabz;

public class PrimitiveDatatypes {

	static int n=35;
	public static void main(String[] args) {
		 
		//primitive datatypes
		byte a = 2;
		System.out.println("The value of byte is :" + a);
		int b = 4;
		System.out.println("The value of int is :" + b);
		short c = 34;
		System.out.println("The value of short is :"+ c);
		long d = 45;
		System.out.println("The value of long is :"+ d);
		float e = 4.9f;
		System.out.println("The value of float is :"+ e);
		double f = 4.8974f;
		System.out.println("The value of double is :" + f);
		char g= 'A';
		System.out.println("The value of char is :"+ g);
		String h ="This is Bridgelabz";
		System.out.println("The value of string is:"+ h);
		
		
		//non-primitive dataypes
		final int i= 20;
		System.out.println("The value of final is :"+ i);
		
		//static datatypes call
		System.out.println("The value of static is:" + PrimitiveDatatypes.n);// call using classname
		
	}
}
