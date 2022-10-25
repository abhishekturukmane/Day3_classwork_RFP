package com.bridgelabz;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value of first String:");
		String str1=obj.nextLine();
		System.out.println("Enter the value of second string:");
		String str2=obj.nextLine();
		if(str1.equals(str2))
		{
			System.out.println("Both the strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}
}
