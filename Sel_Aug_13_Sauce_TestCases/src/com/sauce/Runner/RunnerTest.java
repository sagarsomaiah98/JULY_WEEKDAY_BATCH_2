package com.sauce.Runner;

import com.sauce.testCase.AddToCart_Test;
import com.sauce.testCase.LogOut_Test;
import com.sauce.testCase.Login_Test;

public class RunnerTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Login_Test l= new Login_Test();
		l.login();
		
		
		  LogOut_Test lt= new LogOut_Test(); 
		  lt.logOut();
		  
		  AddToCart_Test at= new AddToCart_Test();
		  at.addToCart();
		 

	}

}
