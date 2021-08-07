package com.janbask.polymorphism;

public class Method_Overloading {
	
	public void name() {
		
		
		System.out.println("no name");
	}
	
	
	public void name(String name) {
		
		System.out.println(name);
	}
	
	public void name(int age) {
		
		System.out.println(age);
	}
	
	public void name(String name, int age) {
		
		System.out.println(name+"  "+age);
	}

	public static void main(String[] args) {
		

		Method_Overloading m = new Method_Overloading();
		m.name("John",23);
		
	}

}
