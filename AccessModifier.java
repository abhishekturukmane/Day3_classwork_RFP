package com.bridgelabz;

public class AccessModifier {

	public void publicMethod() {
		System.out.println("This is a public Method");
	}
	void defaultMethod() {
		System.out.println("This is a default Method");
	}
	private void privateMethod() {
		System.out.println("This is a private method");
	}
	protected void protectedMethod() {
		System.out.println("This is a protected Method");
	}
	public static void main(String[] args) {
		
		AccessModifier obj=new AccessModifier();
		obj.defaultMethod();
		obj.privateMethod();
		obj.publicMethod();
		obj.protectedMethod();
	}
}
