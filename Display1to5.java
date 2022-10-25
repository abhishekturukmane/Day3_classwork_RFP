package com.bridgelabz;

public class Display1to5 {
	
	public void Disp() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("The value is:" + i);
			
		}
	
	}
	
	public static void main(String[] args) {
		Display1to5 ob=new Display1to5();
		ob.Disp();
	}
}
