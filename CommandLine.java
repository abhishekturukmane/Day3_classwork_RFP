package com.bridgelabz;

//import java.util.Scanner;

public class CommandLine {

	public static void main(String[] args) {
		
		
		int x = Integer.parseInt(args[0]);//value
		int y = Integer.parseInt(args[1]);//value
		int z = Integer.parseInt(args[2]);//a
		int k = Integer.parseInt(args[3]);//b
		int count=0;
		int sum=0;
		
		for(int i=0;i<4;i++) 
		{
			int val=Integer.parseInt(args[i]);//convert string value to int 
			String str=args[i];//check for string
			int check=Integer.parseInt(str);//typecasted str to int
			if(check!=val)
			{
				count++;
				
			}
			else
			{
				
				sum = sum + Integer.parseInt(args[i]);
				
			}
		}
		System.out.println("The sum is :" + sum);
		System.out.println("Invalid :"+ count);
		
	}
}
