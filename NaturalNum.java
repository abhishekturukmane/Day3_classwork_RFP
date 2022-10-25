package com.bridgelabz;

public class NaturalNum {

	static int sum=0;
	public void natural() {
		for(int i=1;i<=9;i++)
		{
			System.out.println("The natural no is :"+ i);
			sum=sum+i;
		}
	}
	public static void main(String[] args) {
		NaturalNum ob=new NaturalNum();
		ob.natural();
		System.out.println("The sum of natural numbers is:"+ sum);
		
	}
}
