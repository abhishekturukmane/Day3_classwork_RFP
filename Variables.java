package com.bridgelabz;

public class Variables {
	
	int c=30;//instance
	static int b=40;//static
	//local variable
	public void local() {
		int a =20;
		System.out.println("The local variable is:"+ a);
	}
	public static void main(String[] args) {
		
		Variables obj=new Variables();
		obj.local();//local variable call
		System.out.println("The static variable is :"+ Variables.b);
		System.out.println("The instance variable is :"+ obj.c);
	
}
}
