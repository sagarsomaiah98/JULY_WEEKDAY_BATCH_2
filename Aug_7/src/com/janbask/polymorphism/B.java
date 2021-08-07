package com.janbask.polymorphism;

public class B extends A{
	
	
	public void methodB() {
		System.out.println("method B in class B");
		
	}
	
	
    public void m1() {
		
		System.out.println("m1 method in class B");
	}

	public static void main(String[] args) {
		
		
		B b= new B();
		
		b.methodB();
		
		b.m1();
		b.m2();
		
		System.out.println("******************************");
		A a= new A();
		
		a.m1();
		a.m2();

	}

}
