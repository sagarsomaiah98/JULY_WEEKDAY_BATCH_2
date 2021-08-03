
public class Calculator {


	
	//Addition of two numbers
	public void Add() {
		int a=40;
		int b=20;
		int c=a+b;
		System.out.println("Addition of "+a+"  and "+b +" is "+ c);
		
	}
	
	//Subtraction of two numbers
	public void sub() {
		
		int j=60;
		int k=30;
		int res=j-k;
		System.out.println("subtraction of "+j+"  and "+k +" is "+ res);
		
	}
	
public static void main(String[] args) {
		
		//Step 1: create a object of a class
		//Step 2: call the method
		
		//how to create object of class
		// ClassName objectname = new ClassName();
		
		Calculator cal= new Calculator();
		cal.Add();
		cal.sub();
		
		

		
	
	}

}
