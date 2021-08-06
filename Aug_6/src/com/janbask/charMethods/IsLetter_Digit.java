package com.janbask.charMethods;

public class IsLetter_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char a='A';
		char b='1';
		char c='@';
		System.out.println(Character.isLetter(a));
		System.out.println(Character.isLetter(b));
		
		System.out.println("*************");
		System.out.println(Character.isDigit(a));
         System.out.println(Character.isDigit(b));
         
         System.out.println(Character.isLetter(c));
         
        
	}

}
