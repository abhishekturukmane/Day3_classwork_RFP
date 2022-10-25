package com.bridgelabz;

public class AdditionSubs {

	//user defined method
	int avariable=20;
	int bvariable=30;
	public int addition(int a , int b)
	{
		int result=a+b;
		return result;
	}
	public int sub(int a,int b)
	{
		int res=a-b;
		return res;
		
		
	}
	public int div(int c , int d)
	{
		int result2=d/c;
		return result2;
	}
	public int mul(int c,int d)
	{
		int result3=c*d;
		return result3;
	}
	public static void main(String[] args) {
		AdditionSubs obj=new AdditionSubs();
		int returnstorage=obj.addition(10, 20);
		System.out.println("The addition is:"+ returnstorage);
		int returnsub=obj.sub(20, 10);
		System.out.println("The value of Substraction is:"+ returnsub );
		int return2=obj.div(2,10);
		System.out.println("The value for division is:"+ return2);
		int return3=obj.mul(10, 20);
		System.out.println("The value for multiplication is:"+ return3);
		
		//for variables of class
		int var1=obj.avariable;
		int var2=obj.bvariable;
		System.out.println("The sum is:"+ obj.addition(var1,var2));
		
	}
}
