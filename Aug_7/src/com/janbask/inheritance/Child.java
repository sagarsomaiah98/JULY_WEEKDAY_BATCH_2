package com.janbask.inheritance;

public class Child  extends Parent{
	
	public void B() {
		
		System.out.println("B Method in child ");
	}

	public static void main(String[] args) {
		
		
		Child c = new Child();
		c.B();
		
		// Variable and methods from Parent class
		c.A();
		System.out.println(c.k);
		System.out.println(c.name);
		

	}

}
