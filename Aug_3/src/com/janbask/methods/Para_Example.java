package com.janbask.methods;

public class Para_Example {
	
	
	public void LowerCase(String input)
	{
		//System.out.println(input.toLowerCase());
		
		int lopa=input.length();
		
		String rev="";
		for(int j=lopa-1;j>=0;j--) {
			
		 rev=rev+input.charAt(j);
			
		}
		System.out.println(rev);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Para_Example p = new Para_Example();
		        p.LowerCase("SELENIUM IS A AUTOMATION TOOL");
                 p.LowerCase("JOHN");
                 p.LowerCase("MARK");
                 p.LowerCase("JAKE");
                 p.LowerCase("JAVA IS A PROGRAMMING LANGUAGE");
                 p.LowerCase("SELENIUM IS OPEN SOURCE");
                 p.LowerCase("TESTING IS MY PASSION");
                 p.LowerCase("HENRY");
                 
	}

}
