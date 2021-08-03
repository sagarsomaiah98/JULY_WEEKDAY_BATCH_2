package com.janbask.methods;

public class Demo_Return {
	
	
	public int method1() {
		
		System.out.println("method 1");
		
		int res=50+60;
		return res;
	}
	
	
	public String method2() {
		
		System.out.println("method 2");
		
		
		String value="Welcome to janbask training";
		
        return value.toLowerCase();	
   
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo_Return r = new Demo_Return();
		/*
		 * r.method1();
		 * 
		 * int a=r.method1();
		 * 
		 * System.out.println("a value is "+a);
		 */
		
		r.method2();
		String k=r.method2();
		
		System.out.println("k value is "+k);
		
		
	}

}
